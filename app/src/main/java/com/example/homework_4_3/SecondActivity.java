package com.example.homework_4_3;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import java.util.ArrayList;
import java.util.List;

public class SecondActivity extends AppCompatActivity {

    // создание коллекции контейнера для данных класса Animal
    List<Animal> animals = new ArrayList<Animal>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);

        // инициализируем контейнер
        setInitialData();

        // создадим объект RecyclerView и привяжем к нему соответствующий id
        RecyclerView recyclerView = findViewById(R.id.list_animal);

        // создадим адаптер и загрузим в него контейнер с данными
        AnimalAdapter adapter = new AnimalAdapter(this, animals);

        // на recyclerView подадим адаптер
        recyclerView.setAdapter(adapter);
    }

    // метод setInitialData() устанавливает начальный набор данных (а именно изображения из папки res/drawables)
    private void setInitialData() {
        // добавление в контейнер animals объектов сущности Animal
        animals.add( new Animal("Ориентальная", "Ориентальная – самые большие уши. Кошатники часто сравнивают его с инопланетянином, " +
                "который всеми силами пытается замаскироваться под обычную кошку.",
                R.drawable.orientalnaya, "Численность средняя"));
        animals.add( new Animal("Манчкин", "Стандарт манчкинов допускает практически любой внешний вид, ведь главная их особенность – коротколапость." +
                "Ещё одно их общее сходство – игривость.",
                R.drawable.manchkin, "Численность большая"));
        animals.add( new Animal("Американский керл", "Ушки американского керла закручиваются в рулетики на 3-10 день жизни. " +
                "Они легко травмируются, поэтому при поглаживании его головы нельзя применять силу.",
                R.drawable.amerikanskiy_kerl, "Численность большая"));
        animals.add( new Animal("Рексы ", "В эту группу входят 2 основные разновидности: корниши и девоны. Всех их объединяет кудрявая и мягкая на ощупь шерстка.",
                R.drawable.reksy, "Численность большая"));
        animals.add( new Animal("Египетская мау", "От других пятнистых котов эта изящная красавица отличается отметиной на макушке в виде буквы «W»." +
                "Несмотря на название, египетская мау редко мяукает и предпочитает общаться с хозяевами с помощью мурчания.",
                R.drawable.egipetskaya_mau, "Численность большая"));
    }
}