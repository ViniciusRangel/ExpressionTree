package br.unb.fas.expressiontree.structure;

/**
 * @class CompositeNegateNode
 *
 * @brief Um n� contendo somente o filho da direita. 
 * 			O significado deste n� � -right (ex: -5, -7, etc.). 
 * 			Ele exerce o papel do "Composite" no padr�o "Composite".
 * 
 */ 
public class CompositeNegateNode extends CompositeUnaryNode
{
    /** Ctor */
    public CompositeNegateNode(ComponentNode right)
    {
        super(right);
    }
}
