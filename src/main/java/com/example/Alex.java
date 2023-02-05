package com.example;

import java.util.List;

public class Alex extends Lion{

    public Alex( Feline feline) throws Exception {
        super("Самец", feline);
    }

    public List<String> getFriends(){
        return List.of("Marty", "Gloria", "Melman");
    }

    public String getPlaceOfLiving(){
        return "New York Zoo";
    }

    @Override
    public int getKittens() {
        return 0;
    }
}
