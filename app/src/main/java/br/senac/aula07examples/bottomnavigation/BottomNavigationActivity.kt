package br.senac.aula07examples.bottomnavigation

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.fragment.app.Fragment
import br.senac.aula07examples.R
import br.senac.aula07examples.databinding.ActivityBottomNavigationBinding
import br.senac.aula07examples.fragments.AlbumsFragment
import br.senac.aula07examples.fragments.ArtistsFragment
import br.senac.aula07examples.fragments.RecentsFragment

class BottomNavigationActivity : AppCompatActivity() {

    lateinit var binding: ActivityBottomNavigationBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        var frag: Fragment = RecentsFragment.newInstance()
        supportFragmentManager.beginTransaction()
            .replace(R.id.container, frag).commit()
        super.onCreate(savedInstanceState)
        binding = ActivityBottomNavigationBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.bottomNavigationView.setOnItemSelectedListener {
            when(it.itemId) {
                R.id.recentes -> {

                    supportFragmentManager.beginTransaction()
                        .replace(R.id.container, frag).commit()

                }

                R.id.albuns -> {
                    frag = AlbumsFragment.newInstance()
                    supportFragmentManager.beginTransaction()
                        .replace(R.id.container, frag).commit()

                }
                R.id.artistas -> {
                    frag = ArtistsFragment.newInstance()
                    supportFragmentManager.beginTransaction()
                        .replace(R.id.container, frag).commit()

                }
                R.id.opcoes -> {
                    frag = RecentsFragment.newInstance()
                    supportFragmentManager.beginTransaction()
                        .replace(R.id.container, frag).commit()

                }
            }
            true

        }
    }

}
