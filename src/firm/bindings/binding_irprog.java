package firm.bindings;

/* WARNING: Automatically generated file */
import com.sun.jna.Native;
import com.sun.jna.Pointer;
import firm.Firm;

public class binding_irprog {
	static {
		Native.register(Firm.VERSION.getFileName());
	}

	public static enum ir_relation {
		ir_relation_false(0),
		ir_relation_equal((1 << 0)),
		ir_relation_less((1 << 1)),
		ir_relation_greater((1 << 2)),
		ir_relation_unordered((1 << 3)),
		ir_relation_less_equal((ir_relation.ir_relation_equal.val | ir_relation.ir_relation_less.val)),
		ir_relation_greater_equal((ir_relation.ir_relation_equal.val | ir_relation.ir_relation_greater.val)),
		ir_relation_less_greater((ir_relation.ir_relation_less.val | ir_relation.ir_relation_greater.val)),
		ir_relation_less_equal_greater(((ir_relation.ir_relation_equal.val | ir_relation.ir_relation_less.val) | ir_relation.ir_relation_greater.val)),
		ir_relation_unordered_equal((ir_relation.ir_relation_unordered.val | ir_relation.ir_relation_equal.val)),
		ir_relation_unordered_less((ir_relation.ir_relation_unordered.val | ir_relation.ir_relation_less.val)),
		ir_relation_unordered_less_equal(((ir_relation.ir_relation_unordered.val | ir_relation.ir_relation_less.val) | ir_relation.ir_relation_equal.val)),
		ir_relation_unordered_greater((ir_relation.ir_relation_unordered.val | ir_relation.ir_relation_greater.val)),
		ir_relation_unordered_greater_equal(((ir_relation.ir_relation_unordered.val | ir_relation.ir_relation_greater.val) | ir_relation.ir_relation_equal.val)),
		ir_relation_unordered_less_greater(((ir_relation.ir_relation_unordered.val | ir_relation.ir_relation_less.val) | ir_relation.ir_relation_greater.val)),
		ir_relation_true((((ir_relation.ir_relation_equal.val | ir_relation.ir_relation_less.val) | ir_relation.ir_relation_greater.val) | ir_relation.ir_relation_unordered.val));
		public final int val;

		private static class C {
			static int next_val;
		}

		ir_relation(int val) {
			this.val = val;
			C.next_val = val + 1;
		}

		ir_relation() {
			this.val = C.next_val++;
		}

		public static ir_relation getEnum(int val) {
			for (ir_relation entry : values()) {
				if (val == entry.val)
					return entry;
			}
			return null;
		}
	}

	public static enum ir_cons_flags {
		cons_none(0),
		cons_volatile((1 << 0)),
		cons_unaligned((1 << 1)),
		cons_floats((1 << 2)),
		cons_throws_exception((1 << 3));
		public final int val;

		private static class C {
			static int next_val;
		}

		ir_cons_flags(int val) {
			this.val = val;
			C.next_val = val + 1;
		}

		ir_cons_flags() {
			this.val = C.next_val++;
		}

		public static ir_cons_flags getEnum(int val) {
			for (ir_cons_flags entry : values()) {
				if (val == entry.val)
					return entry;
			}
			return null;
		}
	}

	public static enum op_pin_state {
		op_pin_state_floats(0),
		op_pin_state_pinned(1),
		op_pin_state_exc_pinned();
		public final int val;

		private static class C {
			static int next_val;
		}

		op_pin_state(int val) {
			this.val = val;
			C.next_val = val + 1;
		}

		op_pin_state() {
			this.val = C.next_val++;
		}

		public static op_pin_state getEnum(int val) {
			for (op_pin_state entry : values()) {
				if (val == entry.val)
					return entry;
			}
			return null;
		}
	}

	public static enum cond_jmp_predicate {
		COND_JMP_PRED_NONE(),
		COND_JMP_PRED_TRUE(),
		COND_JMP_PRED_FALSE();
		public final int val;

		private static class C {
			static int next_val;
		}

		cond_jmp_predicate(int val) {
			this.val = val;
			C.next_val = val + 1;
		}

		cond_jmp_predicate() {
			this.val = C.next_val++;
		}

		public static cond_jmp_predicate getEnum(int val) {
			for (cond_jmp_predicate entry : values()) {
				if (val == entry.val)
					return entry;
			}
			return null;
		}
	}

	public static enum mtp_additional_properties {
		mtp_no_property(0),
		mtp_property_no_write((1 << 0)),
		mtp_property_pure((1 << 1)),
		mtp_property_noreturn((1 << 2)),
		mtp_property_terminates((1 << 3)),
		mtp_property_nothrow((1 << 4)),
		mtp_property_naked((1 << 5)),
		mtp_property_malloc((1 << 6)),
		mtp_property_returns_twice((1 << 7)),
		mtp_property_private((1 << 8)),
		mtp_property_always_inline((1 << 9)),
		mtp_property_noinline((1 << 10)),
		mtp_property_inline_recommended((1 << 11)),
		mtp_temporary((1 << 12));
		public final int val;

		private static class C {
			static int next_val;
		}

		mtp_additional_properties(int val) {
			this.val = val;
			C.next_val = val + 1;
		}

		mtp_additional_properties() {
			this.val = C.next_val++;
		}

		public static mtp_additional_properties getEnum(int val) {
			for (mtp_additional_properties entry : values()) {
				if (val == entry.val)
					return entry;
			}
			return null;
		}
	}

	public static enum ir_builtin_kind {
		ir_bk_trap(),
		ir_bk_debugbreak(),
		ir_bk_return_address(),
		ir_bk_frame_address(),
		ir_bk_prefetch(),
		ir_bk_ffs(),
		ir_bk_clz(),
		ir_bk_ctz(),
		ir_bk_popcount(),
		ir_bk_parity(),
		ir_bk_bswap(),
		ir_bk_inport(),
		ir_bk_outport(),
		ir_bk_saturating_increment(),
		ir_bk_compare_swap(),
		ir_bk_may_alias(),
		ir_bk_va_start(),
		ir_bk_va_arg(),
		ir_bk_last(ir_builtin_kind.ir_bk_va_arg.val);
		public final int val;

		private static class C {
			static int next_val;
		}

		ir_builtin_kind(int val) {
			this.val = val;
			C.next_val = val + 1;
		}

		ir_builtin_kind() {
			this.val = C.next_val++;
		}

		public static ir_builtin_kind getEnum(int val) {
			for (ir_builtin_kind entry : values()) {
				if (val == entry.val)
					return entry;
			}
			return null;
		}
	}

	public static enum ir_volatility {
		volatility_non_volatile(),
		volatility_is_volatile();
		public final int val;

		private static class C {
			static int next_val;
		}

		ir_volatility(int val) {
			this.val = val;
			C.next_val = val + 1;
		}

		ir_volatility() {
			this.val = C.next_val++;
		}

		public static ir_volatility getEnum(int val) {
			for (ir_volatility entry : values()) {
				if (val == entry.val)
					return entry;
			}
			return null;
		}
	}

	public static enum ir_align {
		align_is_aligned(0),
		align_non_aligned();
		public final int val;

		private static class C {
			static int next_val;
		}

		ir_align(int val) {
			this.val = val;
			C.next_val = val + 1;
		}

		ir_align() {
			this.val = C.next_val++;
		}

		public static ir_align getEnum(int val) {
			for (ir_align entry : values()) {
				if (val == entry.val)
					return entry;
			}
			return null;
		}
	}

	public static enum float_int_conversion_overflow_style_t {
		ir_overflow_indefinite(),
		ir_overflow_min_max();
		public final int val;

		private static class C {
			static int next_val;
		}

		float_int_conversion_overflow_style_t(int val) {
			this.val = val;
			C.next_val = val + 1;
		}

		float_int_conversion_overflow_style_t() {
			this.val = C.next_val++;
		}

		public static float_int_conversion_overflow_style_t getEnum(int val) {
			for (float_int_conversion_overflow_style_t entry : values()) {
				if (val == entry.val)
					return entry;
			}
			return null;
		}
	}

	public static enum irg_callee_info_state {
		irg_callee_info_none(),
		irg_callee_info_consistent(),
		irg_callee_info_inconsistent();
		public final int val;

		private static class C {
			static int next_val;
		}

		irg_callee_info_state(int val) {
			this.val = val;
			C.next_val = val + 1;
		}

		irg_callee_info_state() {
			this.val = C.next_val++;
		}

		public static irg_callee_info_state getEnum(int val) {
			for (irg_callee_info_state entry : values()) {
				if (val == entry.val)
					return entry;
			}
			return null;
		}
	}

	public static enum ir_resources_t {
		IR_RESOURCE_NONE(0),
		IR_RESOURCE_BLOCK_VISITED((1 << 0)),
		IR_RESOURCE_BLOCK_MARK((1 << 1)),
		IR_RESOURCE_IRN_VISITED((1 << 2)),
		IR_RESOURCE_IRN_LINK((1 << 3)),
		IR_RESOURCE_LOOP_LINK((1 << 4)),
		IR_RESOURCE_PHI_LIST((1 << 5));
		public final int val;

		private static class C {
			static int next_val;
		}

		ir_resources_t(int val) {
			this.val = val;
			C.next_val = val + 1;
		}

		ir_resources_t() {
			this.val = C.next_val++;
		}

		public static ir_resources_t getEnum(int val) {
			for (ir_resources_t entry : values()) {
				if (val == entry.val)
					return entry;
			}
			return null;
		}
	}

	public static enum ir_graph_constraints_t {
		IR_GRAPH_CONSTRAINT_ARCH_DEP((1 << 0)),
		IR_GRAPH_CONSTRAINT_MODEB_LOWERED((1 << 1)),
		IR_GRAPH_CONSTRAINT_NORMALISATION2((1 << 2)),
		IR_GRAPH_CONSTRAINT_OPTIMIZE_UNREACHABLE_CODE((1 << 3)),
		IR_GRAPH_CONSTRAINT_CONSTRUCTION((1 << 4)),
		IR_GRAPH_CONSTRAINT_TARGET_LOWERED((1 << 5)),
		IR_GRAPH_CONSTRAINT_BACKEND((1 << 6));
		public final int val;

		private static class C {
			static int next_val;
		}

		ir_graph_constraints_t(int val) {
			this.val = val;
			C.next_val = val + 1;
		}

		ir_graph_constraints_t() {
			this.val = C.next_val++;
		}

		public static ir_graph_constraints_t getEnum(int val) {
			for (ir_graph_constraints_t entry : values()) {
				if (val == entry.val)
					return entry;
			}
			return null;
		}
	}

	public static enum ir_graph_properties_t {
		IR_GRAPH_PROPERTIES_NONE(0),
		IR_GRAPH_PROPERTY_NO_CRITICAL_EDGES((1 << 0)),
		IR_GRAPH_PROPERTY_NO_BADS((1 << 1)),
		IR_GRAPH_PROPERTY_NO_TUPLES((1 << 2)),
		IR_GRAPH_PROPERTY_NO_UNREACHABLE_CODE((1 << 3)),
		IR_GRAPH_PROPERTY_ONE_RETURN((1 << 4)),
		IR_GRAPH_PROPERTY_CONSISTENT_DOMINANCE((1 << 5)),
		IR_GRAPH_PROPERTY_CONSISTENT_POSTDOMINANCE((1 << 6)),
		IR_GRAPH_PROPERTY_CONSISTENT_DOMINANCE_FRONTIERS((1 << 7)),
		IR_GRAPH_PROPERTY_CONSISTENT_OUT_EDGES((1 << 8)),
		IR_GRAPH_PROPERTY_CONSISTENT_OUTS((1 << 9)),
		IR_GRAPH_PROPERTY_CONSISTENT_LOOPINFO((1 << 10)),
		IR_GRAPH_PROPERTY_CONSISTENT_ENTITY_USAGE((1 << 11)),
		IR_GRAPH_PROPERTY_MANY_RETURNS((1 << 12)),
		IR_GRAPH_PROPERTIES_CONTROL_FLOW(((((((ir_graph_properties_t.IR_GRAPH_PROPERTY_NO_CRITICAL_EDGES.val | ir_graph_properties_t.IR_GRAPH_PROPERTY_ONE_RETURN.val) | ir_graph_properties_t.IR_GRAPH_PROPERTY_NO_UNREACHABLE_CODE.val) | ir_graph_properties_t.IR_GRAPH_PROPERTY_CONSISTENT_LOOPINFO.val) | ir_graph_properties_t.IR_GRAPH_PROPERTY_CONSISTENT_DOMINANCE.val) | ir_graph_properties_t.IR_GRAPH_PROPERTY_CONSISTENT_POSTDOMINANCE.val) | ir_graph_properties_t.IR_GRAPH_PROPERTY_CONSISTENT_DOMINANCE_FRONTIERS.val)),
		IR_GRAPH_PROPERTIES_ALL(((((((ir_graph_properties_t.IR_GRAPH_PROPERTIES_CONTROL_FLOW.val | ir_graph_properties_t.IR_GRAPH_PROPERTY_NO_BADS.val) | ir_graph_properties_t.IR_GRAPH_PROPERTY_NO_TUPLES.val) | ir_graph_properties_t.IR_GRAPH_PROPERTY_CONSISTENT_OUT_EDGES.val) | ir_graph_properties_t.IR_GRAPH_PROPERTY_CONSISTENT_OUTS.val) | ir_graph_properties_t.IR_GRAPH_PROPERTY_CONSISTENT_ENTITY_USAGE.val) | ir_graph_properties_t.IR_GRAPH_PROPERTY_MANY_RETURNS.val));
		public final int val;

		private static class C {
			static int next_val;
		}

		ir_graph_properties_t(int val) {
			this.val = val;
			C.next_val = val + 1;
		}

		ir_graph_properties_t() {
			this.val = C.next_val++;
		}

		public static ir_graph_properties_t getEnum(int val) {
			for (ir_graph_properties_t entry : values()) {
				if (val == entry.val)
					return entry;
			}
			return null;
		}
	}

	public static enum ir_segment_t {
		IR_SEGMENT_FIRST(),
		IR_SEGMENT_GLOBAL(ir_segment_t.IR_SEGMENT_FIRST.val),
		IR_SEGMENT_THREAD_LOCAL(),
		IR_SEGMENT_CONSTRUCTORS(),
		IR_SEGMENT_DESTRUCTORS(),
		IR_SEGMENT_JCR(),
		IR_SEGMENT_LAST(ir_segment_t.IR_SEGMENT_JCR.val);
		public final int val;

		private static class C {
			static int next_val;
		}

		ir_segment_t(int val) {
			this.val = val;
			C.next_val = val + 1;
		}

		ir_segment_t() {
			this.val = C.next_val++;
		}

		public static ir_segment_t getEnum(int val) {
			for (ir_segment_t entry : values()) {
				if (val == entry.val)
					return entry;
			}
			return null;
		}
	}

	public static enum irp_resources_t {
		IRP_RESOURCE_NONE(0),
		IRP_RESOURCE_IRG_LINK((1 << 0)),
		IRP_RESOURCE_ENTITY_LINK((1 << 1)),
		IRP_RESOURCE_TYPE_VISITED((1 << 2)),
		IRP_RESOURCE_TYPE_LINK((1 << 3));
		public final int val;

		private static class C {
			static int next_val;
		}

		irp_resources_t(int val) {
			this.val = val;
			C.next_val = val + 1;
		}

		irp_resources_t() {
			this.val = C.next_val++;
		}

		public static irp_resources_t getEnum(int val) {
			for (irp_resources_t entry : values()) {
				if (val == entry.val)
					return entry;
			}
			return null;
		}
	}


	public static native void irp_reserve_resources(Pointer irp, /* irp_resources_t */int resources);

	public static native void irp_free_resources(Pointer irp, /* irp_resources_t */int resources);

	public static native /* irp_resources_t */int irp_resources_reserved(Pointer irp);

	public static native Pointer get_irp();

	public static native void set_irp(Pointer irp);

	public static native Pointer new_ir_prog(String name);

	public static native void free_ir_prog();

	public static native void set_irp_prog_name(Pointer name);

	public static native int irp_prog_name_is_set();

	public static native Pointer get_irp_ident();

	public static native String get_irp_name();

	public static native Pointer get_irp_main_irg();

	public static native void set_irp_main_irg(Pointer main_irg);

	public static native com.sun.jna.NativeLong get_irp_last_idx();

	public static native com.sun.jna.NativeLong get_irp_n_irgs();

	public static native Pointer get_irp_irg(com.sun.jna.NativeLong pos);

	public static native void set_irp_irg(com.sun.jna.NativeLong pos, Pointer irg);

	public static native Pointer get_segment_type(/* ir_segment_t */int segment);

	public static native void set_segment_type(/* ir_segment_t */int segment, Pointer new_type);

	public static native Pointer get_glob_type();

	public static native Pointer get_tls_type();

	public static native Pointer ir_get_global(Pointer name);

	public static native com.sun.jna.NativeLong get_irp_n_types();

	public static native Pointer get_irp_type(com.sun.jna.NativeLong pos);

	public static native void set_irp_type(com.sun.jna.NativeLong pos, Pointer typ);

	public static native Pointer get_const_code_irg();

	public static native /* irg_callee_info_state */int get_irp_callee_info_state();

	public static native void set_irp_callee_info_state(/* irg_callee_info_state */int s);

	public static native com.sun.jna.NativeLong get_irp_next_label_nr();

	public static native void add_irp_asm(Pointer asm_string);

	public static native com.sun.jna.NativeLong get_irp_n_asms();

	public static native Pointer get_irp_asm(com.sun.jna.NativeLong pos);
}
