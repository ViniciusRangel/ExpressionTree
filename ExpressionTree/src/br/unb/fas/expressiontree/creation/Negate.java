package br.unb.fas.expressiontree.creation;

import br.unb.fas.expressiontree.structure.ComponentNode;
import br.unb.fas.expressiontree.structure.CompositeNegateNode;

/**
 * @class Negate
 *
 * @brief Define um n� na �rvore sint�tica para operadores n�o 
 * 		terminais un�rios menos.
 */
class Negate extends UnaryOperator
{
    /** Preced�ncia do operador '-' (nega��o). */
    final static int negatePrecedence = 3;

	
    /** Ctor */
    public Negate()
    {
        super(null, negatePrecedence);
    }

    /**Adicione preced�ncia ao valor corrente*/
    public int addPrecedence(int accumulatedPrecedence)
    {
        return precedence =
            negatePrecedence + accumulatedPrecedence;
    }

    /** M�todo para cosntru��o do n� @a Negate.*/
    ComponentNode build()
    {
        return new CompositeNegateNode(right.build());
    }

    /** Retorna a procedencia corrente. */
    public int precedence()
    {
        return precedence;
    }
}
