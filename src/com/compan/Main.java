package com.compan;

public class Main {

    public static void main(String[] args) {

        Cow cow1=new Cow("mishsa",7,500);
        Cow cow2=new Cow("sasha",6,789);
        Cow cow3=new Cow("ashka",5,654);
        Cow cow4=new Cow("oshka",4,675);
        Cow cow5=new Cow("mashka",6,987);
        Cow cow6=new Cow("mashka",6,987);
        Cow cow7=new Cow("mashka",6,987);

        Cow[] cows=new Cow[]{cow1,cow2,cow3,cow4,cow5};
        Cow[] cows1=new Cow[]{cow6,cow7};

        Sheep sheep1=new Sheep("koi",5,231);
        Sheep sheep2=new Sheep("koi",5,231);
        Sheep sheep3=new Sheep("koilorr",5,231);
        Sheep sheep4=new Sheep("ker",5,231);
        Sheep sheep5=new Sheep("ser",5,231);
        Sheep sheep6=new Sheep("koilor",5,231);
        Sheep sheep7=new Sheep("wer",5,231);
        Sheep sheep8=new Sheep("uyt",5,231);
        Sheep sheep9=new Sheep("koiii",5,231);
        Sheep sheep10=new Sheep("oii",5,231);
        Sheep sheep11=new Sheep("kany",5,231);
        Sheep sheep12=new Sheep("koi",5,231);

        Sheep[] sheep=new Sheep[]{sheep1,sheep2,sheep3,sheep4,sheep5,sheep6,sheep7,sheep8};
        Sheep[] sheeep=new Sheep[]{sheep9,sheep10,sheep11,sheep12};

        Horse horse1=new Horse("ui",4,876);
        Horse horse2=new Horse("ui",4,876);
        Horse horse3=new Horse("ui",4,876);
        Horse horse4=new Horse("ui",4,876);
        Horse horse5=new Horse("ui",4,876);
        Horse horse6=new Horse("ui",4,876);
        Horse horse7=new Horse("ui",4,876);

        Horse[] horse=new Horse[]{horse1,horse2,};
        Horse[] horses=new Horse[]{horse3,horse4,horse5,horse6,horse7};

        Jailoo jailoo1=new Jailoo("чон арык","Naryn","Asan",cows,sheep,horse);
        Jailoo jailoo2=new Jailoo("Kyrchyn","Yssyk kol","saki",cows1,sheeep,horses);
        System.out.println(jailoo1);
        System.out.println("-------------------------------------------------------------");
        System.out.println(jailoo2);






    }
}
