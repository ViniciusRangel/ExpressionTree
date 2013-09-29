package br.unb.fas.expressiontree.structure;

/**
 * @class CompositeDivideNode
 * 
 * @brief 	Um n� contendo os filhos da esquerda e direita. 
 * 			O significado deste n� � left / right. Ele exerce
 * 			o papel do "Composite" no padr�o "Composite"..
 */
public class CompositeDivideNode extends CompositeBinaryNode
{
    /** Ctor */
    public CompositeDivideNode(ComponentNode left,
                               ComponentNode right)
    {
        super(left, right);
    }

}
