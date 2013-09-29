package br.unb.fas.expressiontree.structure;

/**
 * @class CompositeBinaryNode
 *
 * @brief Define um n� esqueda e direita (via heran�a).  Ele exerce
 * 		o papel de "Composite" no padr�o Composite.
 */
public class CompositeBinaryNode extends CompositeUnaryNode
{
    /** Refer�ncia a filho da esquerda. */
    private ComponentNode left;
  
    /** Ctor */
    public CompositeBinaryNode(ComponentNode left,
                               ComponentNode right)
    {
        super(right);
        this.left = left;
    }

    /** Retorna o filho da esquerda. */
    public ComponentNode left()
    {
	return left;
    }
}
