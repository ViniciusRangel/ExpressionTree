package br.unb.fas.expressiontree.creation;

import br.unb.fas.expressiontree.structure.ComponentNode;

/**
 * @class UnaryOperator
 *
 * @brief Define um n� na �rvore sint�tica para express�es n�o terminais un�rias.
 */
public abstract class UnaryOperator extends Symbol
{
    /** Ctor */
    UnaryOperator(Symbol right,
                  int precedence)
    {
        super(null, right, precedence);
    }

    /** M�todo abstrato para constru��o de um n� @a UnaryOperator. */
    abstract ComponentNode build();
}
