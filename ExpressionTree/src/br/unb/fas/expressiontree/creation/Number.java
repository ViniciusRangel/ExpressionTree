package br.unb.fas.expressiontree.creation;

import br.unb.fas.expressiontree.structure.ComponentNode;
import br.unb.fas.expressiontree.structure.LeafNode;

/**
 * @class Number
 *
 * @brief Define um n� que analisa sintaticamente express�es terminais num�ricas.
 */
class Number extends Symbol
{
	
    /** Preced�ncia de n�mero. */
    final static int numberPrecedence = 4;
    
    /** Valor do N�mero. */
    public int item;

    /** Ctor */
    public Number(String input)
    {
        super(null, null, numberPrecedence);
        item = Integer.parseInt(input);
    }

    /** Ctor */
    public Number(int input)
    {
        super(null, null, numberPrecedence);
        item = input;
    }

    /** 
     * Adiciona numberPrecedence ao accumulatedPrecedence corrente.
     */
    public int addPrecedence(int accumulatedPrecedence)
    {
        return precedence = 
            numberPrecedence + accumulatedPrecedence;
    }

    /** 
     * Metodo para retornar o n�vel de proced�ncia (valores elevados significam maior preced�ncia).
     */
    public int precedence()
    {
        return precedence;
    }

    /** Constroi um @a LeadNode. */
    ComponentNode build()
    {
        return new LeafNode(item);
    }
}

