package br.unb.fas.expressiontree.structure;

/**
 * @class CompositeUnaryNode
 *
 * @brief 	Define o filho direito (mas n�o o esquerdo) e, ent�o, passa
 * 			a ser �til para opera��es un�rias. Ela exerce o papel do
 * 			"Composite" no padr�o Composite.
 */
public class CompositeUnaryNode extends ComponentNode
{
    /** Refer�ncia ao filho da direita. */
    private ComponentNode right;
	
    /** Ctor */
    public CompositeUnaryNode(ComponentNode right)
    {
        this.right = right;
 
    }
	
    /** Retorna o filho da direita. */
    public ComponentNode right() 
    {
        return this.right;
    }
}
