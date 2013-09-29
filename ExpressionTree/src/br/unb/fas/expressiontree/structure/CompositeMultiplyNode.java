package br.unb.fas.expressiontree.structure;

/**
 * @class CompositeMultiplyNode
 *
 * @brief 	Um n� contendo os filhos da esquerda e direita. 
 * 			O significado deste n� � left * right. Ele exerce
 * 			o papel do "Composite" no padr�o "Composite".
 */
public class CompositeMultiplyNode extends CompositeBinaryNode
{
    /** Ctor */
    public CompositeMultiplyNode(ComponentNode left,
                                 ComponentNode right)
    {
        super(left, right);
    }
  

}
