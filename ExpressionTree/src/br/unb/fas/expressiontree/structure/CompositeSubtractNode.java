package br.unb.fas.expressiontree.structure;

/**
 * @class CompositeSubtractNode
 *
 * @brief Um n� contendo os filhos da esquerda e direita. 
 * 			O significado deste n� � left - right. Ele exerce
 * 			o papel do "Composite" no padr�o "Composite".
 */
public class CompositeSubtractNode extends CompositeBinaryNode
{
    /** Ctor */
    public CompositeSubtractNode(ComponentNode left,
                                 ComponentNode right)
    {
        super(left, right);
    }

}
