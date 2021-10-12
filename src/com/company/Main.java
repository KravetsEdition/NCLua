package com.company;


import com.company.NCL.Cases;
import com.company.NCL.NCLNameCaseUa;

public class Main {

    public static void main(String[] args) {
        NCLNameCaseUa nc = new NCLNameCaseUa();
        String[] name = {
                "Кравець Владислав Володимирович",
                "Андрющенко Орест Жданович",
                "Атрошенко Хотян Северинович",
                "Байдак Світ Артурович",
                "Бурбеза Горигляд Арсенович",
                "Бурко Горун Чеславович",
                "Білан Захарій Денисович",
                "Вагилевич Еразм Артурович",
                "Величковський Дмитро Сарматович",
                "Вишиваний Йосип Августинович",
                "Вівсяний Яровид Юліанович",
                "Герасименко Листвич Жданович",
                "Гопко Далемир Антонович",
                "Гупало Творилад Северинович",
                "Гірник Фрол Макарович",
                "Джус Життєлюб Жданович",
                "Добряк Олег Арсенович",
                "Дубас Тимур Володимирович",
                "Журавленко Твердислав Борисович",
                "Засенко Надій Леонідович",
                "Кабаченко Юхим Владиславович",
                "Козицький Буревій Леонідович",
                "Конюшенко Оримир Йосипович",
                "Конюшенко Щастибог Зорянович",
                "Косьяненко Житомир Адріанович",
                "Крітенко Федір Милославович",
                "Лагодовський Голубко Вітанович",
                "Лесько Єгор Максимович",
                "Лящук Свободан Янович",
                "Лікарчук Юхим Гордиславович",
                "Мацука Йомер Северинович",
                "Модзалевський Фрол Златович",
                "Мохнацький Щастислав Артурович",
                "Музика Тиміш Азарович",
                "Нижанківський Євстафій Ярославович",
                "Никончук Цвітан Арсенович",
                "Політило Щедрогост Артемович",
                "Потульницький Іларіон Юліанович",
                "Ревуцький Толислав Добромирович",
                "Рубаненко Святовид Богуславович",
                "Рябовіл Щек Вадимович",
                "Сидорук Шарль Юхимович",
                "Симоненко Родан Бажанович",
                "Соловей Никифор Макарович",
                "Суховерський Еміль Добромирович",
                "Ткач Найден Устимович",
                "Фіґоль Шерлок Омелянович",
                "Шахрай Ладолюб Олегович",
                "Штинь Йомер Милославович"
        };

        for (String s : name) {
            System.out.print(nc.convertToOtherCase(s, Cases.RODOVIY) + "\n");
        }
    }
}
