package one.digitalinnovaton.gof.service;

import one.digitalinnovaton.gof.model.Pokemon;

/**
 * Interface que defie o padrão Strategy no domínio do pokemon. Com isso, se necessário, podemos ter múltiplas implementações 
 * mesma interface
 * 
 * @author Erinaldo Silva
 * 
 */

public interface PokemonService {
    
    Iterable<Pokemon> buscarTodos();

    Pokemon buscarPorId(Long id);

    void cadastrarPokemon(Pokemon pokemon);

    void atualizarPokemon(Long id, Pokemon pokemon);

    void deletarPokemon(Long id);
    
}
