package br.com.projetogamer.kassio.projetogamer.exceptions;

/**
 * Created by Kassio on 18/09/2017.
 */

public class JogoNaoExisteException extends Exception {
    public JogoNaoExisteException(){
        super("Esse Jogo não existe");
    }
}
