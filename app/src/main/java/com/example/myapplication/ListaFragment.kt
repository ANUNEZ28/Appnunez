package com.example.myapplication

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.LinearLayoutManager
import com.example.myapplication.DataRetrofit.Entity.Result
import com.example.myapplication.DataRetrofit.Entity.entiesCharacter
import com.example.myapplication.DataRetrofit.RetrofitCnn
import com.example.myapplication.Utils.extension_fun.toUserItemList
import com.example.myapplication.databinding.FragmentListaBinding
import com.example.myapplication.recycler.adapter.MyAdapter
import com.example.myapplication.recycler.enums.SetData
import retrofit2.Call
import retrofit2.Callback
import retrofit2.Response

class ListaFragment : Fragment() {
    private var _binding: FragmentListaBinding ? = null
    private val binding get() = _binding!!

    private val getDataSource = SetData.Retrofit
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        _binding = FragmentListaBinding.inflate(inflater, container, false)
        return binding.root
    }

    /** */
    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        when(getDataSource){
            SetData.Retrofit -> getFromRetrofit()
           // SetData.Dummy -> getDummyData()
        }

    }
    private fun getFromRetrofit() {
        RetrofitCnn().apiService.getCharacters().enqueue(object : Callback<entiesCharacter>{
            override fun onResponse(
                call: Call<entiesCharacter>,
                response: Response<entiesCharacter>
            ) {
                val characterList = response.body()?.results?: emptyList()
                showInRecycler(characterList)
            }

            override fun onFailure(call: Call<entiesCharacter>, t: Throwable) {
              //  showToast("Error")
            }

        })
    }

    private fun showInRecycler(characterList: List<Result>) {

            val myAdapter=MyAdapter(dataList = characterList.toUserItemList())
        with(binding){
            rvFragmentRecycler.layoutManager=LinearLayoutManager(requireContext())
            rvFragmentRecycler.adapter=myAdapter
        }
    }

}