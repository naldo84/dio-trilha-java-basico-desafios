package one.digitalinnovaton.gof.service.impl;

import one.digitalinnovaton.gof.model.Pokemon;
import one.digitalinnovaton.gof.service.PokemonService;

public class PokemonServiceImp implements PokemonService{

    //TODO Singleton: Injetar os componentes do Spring com @Autowired
    //TODO Strategy: Implementar os métodos definidos na interface
    //TODO Facade: Abstrair integrações com subsistemas, provendo uma interface simples.

    @Override
    public Iterable<Pokemon> buscarTodos() {
        // FIXME Buscar todos os pokemons.
        throw new UnsupportedOperationException("Unimplemented method 'buscarTodos'");
    }

    @Override
    public Pokemon buscarPorId(Long id) {
        // FIXME Buscar pokemon por id.
        throw new UnsupportedOperationException("Unimplemented method 'buscarPorId'");
    }

    @Override
    public void cadastrarPokemon(Pokemon pokemon) {
        // FIXME Verificar se o pokemon já existe.
        // FIXMECaso não exista, persistir o retorno.
        // FIXME Inserir pokemon, vinculando ao ataque (novo ou existente).
        throw new UnsupportedOperationException("Unimplemented method 'cadastrarPokemon'");
    }

    @Override
    public void atualizarPokemon(Long id, Pokemon pokemon) {
        // FIXME Buscar pokemon por ID, caso exista;
        // FIXME Verificar se o ataque do pokemon já existe (pelo id).
        // FIXME Caso não exista, persistir o retorno.
        // FIXME Alterar o pokemon, vinculando o Ataque.
        throw new UnsupportedOperationException("Unimplemented method 'atualizarPokemon'");
    }

    @Override
    public void deletarPokemon(Long id) {
        // FIXME Deletar Pokemon por ID.
        throw new UnsupportedOperationException("Unimplemented method 'deletarPokemon'");
    }
    
}
