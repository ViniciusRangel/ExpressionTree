package br.unb.fas.expressiontree.structure;

/**
 * @class CompositeAddNode
 *
 * @brief	Um n� contendo os filhos da esquerda e direita. 
 * 			O significado deste n� � left + right. Ele exerce
 * 			o papel do "Composite" no padr�o "Composite".
 */
public class CompositeAddNode extends CompositeBinaryNode
{
    /** Ctor */
    public CompositeAddNode(ComponentNode left,
                            ComponentNode right)
    {
        super(left, right);
    }


}
