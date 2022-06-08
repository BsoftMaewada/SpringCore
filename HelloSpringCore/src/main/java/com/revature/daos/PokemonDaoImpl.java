package com.revature.daos;

import com.revature.models.Pokemon;
import com.revature.services.PokemonService;

import java.util.ArrayList;
import java.util.List;

public class PokemonDaoImpl implements PokemonDao {

    private PokemonDao pokeDao;

    //making default constructor for setter injection that is coming later
    public PokemonDaoImpl(){}

    //constructor injection example
    public PokemonDaoImpl(PokemonDao pokemonDao){
        this.pokeDao = pokemonDao;
    }

    //setter injection example
    public void setPokeDao(PokemonDao pokeDao){
        this.pokeDao = pokeDao;
    }



    @Override
    public List<Pokemon> getAllPokemon() {
//        return pokeDao.getAllPokemon();
        List<Pokemon> dbPokemon = new ArrayList<>();

        dbPokemon.add(new Pokemon(1, "pikachu", "electric", 1500));
        dbPokemon.add(new Pokemon(2, "abku", "psychic", 13400));
        dbPokemon.add(new Pokemon(3, "psyduck", "water", 900));
        dbPokemon.add(new Pokemon(4, "gastly", "ghost", 1500));
        dbPokemon.add(new Pokemon(5, "Arceus", "normal", 12000000));
        dbPokemon.add(new Pokemon(6, "charmeleon", "fire", 2500));
        return dbPokemon;

    }
}