package br.unb.fas.expressiontree.creation;

import br.unb.fas.expressiontree.structure.ComponentNode;
import br.unb.fas.expressiontree.structure.CompositeAddNode;

/**
 * @class Add
 *
 * @brief Define um n� na �rvore sint�tica o operador n�o terminal bin�rio add.
 */
class Add extends Operator
{

    /** Ctor */
    public Add()
    {
        super(null, null, addSubPrecedence);
    }

    /** Adiciona a preced�ncia ao valor corrente. */
    public int addPrecedence(int accumulatedPrecedence)
    {
        return precedence =
            addSubPrecedence + accumulatedPrecedence;
    }

    /** M�todo para construir um n� @a Add. */
    ComponentNode build()
    {
        return new CompositeAddNode(left.build(),
                                    right.build());
    }

    /** Retorna a proced�ncia corrente. */
    public int precedence()
    {
        return precedence;
    }
}
