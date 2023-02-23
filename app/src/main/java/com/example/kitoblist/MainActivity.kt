package com.example.kitoblist

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.kitoblist.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    lateinit var mainBinding : ActivityMainBinding
    var kitoblar = mutableListOf<Kitob>()
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        mainBinding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(mainBinding.root)
        kitobQosh()

        var kitobAdapter = KitobAdapter(this, kitoblar)
        mainBinding.mainlist.adapter = kitobAdapter


        mainBinding.mainlist.setOnItemClickListener { parent, view, position, id ->
            var kitob = kitoblar.get(position)

            var intent = Intent(this, KitobInfo::class.java)

            intent.putExtra("kitob", kitob)
            startActivity(intent)


        }


    }




    fun kitobQosh(){
        kitoblar.add(Kitob("Понедельник начинается в субботу", R.drawable.pon_nach_v_sub,
            "братья Стругацкие",
        "«Понеде́льник начина́ется в суббо́ту» (1965) — фантастическая юмористическая повесть" +
                " братьев Стругацких, одно из наиболее своеобразных воплощений советской утопии" +
                " 1960-х годов, художественная реализация мечты авторов о возможности для" +
                " современного талантливого человека сосредоточиться на научном творчестве" +
                " и познании тайн Вселенной. Существенную роль в повести играют также ярко" +
                " выраженные сатирические мотивы;" +
                " в ней высмеиваются приспособленцы, бюрократы и жулики от науки."))

        kitoblar.add(Kitob("Дети капитана Гранта", R.drawable.deti_kapitan_grant,
        "Жюль Верн",
        "«Де́ти капита́на Гра́нта» (фр. Les Enfants du capitaine Grant) — приключенческий роман французского писателя Жюля Верна.\n" +
                "\n" +
                "Роман состоит из трёх частей, в каждой из них главные герои повествования — " +
                "лорд и леди Гленарван, майор Мак-Наббс, Жак Паганель, Мэри и Роберт Грант," +
                " Джон Манглс — в поисках потерпевшего кораблекрушение капитана Гранта" +
                " путешествуют вокруг Земли по Южной Америке через Патагонию, по Австралии" +
                " и Новой Зеландии, строго придерживаясь 37-й параллели южной широты."))


    }
}