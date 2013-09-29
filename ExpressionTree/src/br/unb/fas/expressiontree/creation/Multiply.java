package br.unb.fas.expressiontree.creation;

import br.unb.fas.expressiontree.structure.ComponentNode;
import br.unb.fas.expressiontree.structure.CompositeMultiplyNode;

/**
 * @class Multiply
 *
 * @brief Define um n� da �rvore sint�tica para operador bin�rio n�o terminal multiply.
 */
class Multiply extends Operator
{
    /** Ctor */
    public Multiply()
    {
        super(null, null, mulDivPrecedence);
    }

    /** Adiciona a preced�ncia ao valor corrente. */
    public int addPrecedence(int accumulatedPrecedence)
    {
        return precedence =
            mulDivPrecedence + accumulatedPrecedence;
    }

    /** M�todo para contru��o do n� @a Multiple. */
    ComponentNode build()
    {
        return new CompositeMultiplyNode(left.build(),
                                         right.build());
    }

    /** Retorna a preced�ncia. */
    public int precedence()
    {
        return precedence;
    }
}