/* Warning: Automatically generated file */
package firm.nodes;

import com.sun.jna.Pointer;

public class Not extends Unop {

	public Not(Pointer ptr) {
		super(ptr);
	}

	
	@Override
	public Node getOp() {
		return createWrapper(firm.bindings.binding_irnode.get_Not_op(ptr));
	}

	@Override
	public void setOp(Node op) {
		firm.bindings.binding_irnode.set_Not_op(this.ptr, op.ptr);
	}
	

	

	

	public static final int pnMax = 0;

	
	public void accept(NodeVisitor visitor) {
		visitor.visit(this);
	} 
	
}