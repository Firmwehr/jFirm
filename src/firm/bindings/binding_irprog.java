package firm.bindings;

/* WARNING: Automatically generated file */
import com.sun.jna.Native;
import com.sun.jna.Pointer;

public class binding_irprog {
	static {
		Native.register("firm");
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
		cons_floats((1 << 2));
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
		op_pin_state_exc_pinned(),
		op_pin_state_mem_pinned();
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
		mtp_no_property(0x00000000),
		mtp_property_const(0x00000001),
		mtp_property_pure(0x00000002),
		mtp_property_noreturn(0x00000004),
		mtp_property_nothrow(0x00000008),
		mtp_property_naked(0x00000010),
		mtp_property_malloc(0x00000020),
		mtp_property_returns_twice(0x00000040),
		mtp_property_intrinsic(0x00000080),
		mtp_property_runtime(0x00000100),
		mtp_property_private(0x00000200),
		mtp_property_has_loop(0x00000400),
		mtp_property_inherited((1 << 31));
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

	public static enum symconst_kind {
		symconst_type_tag(),
		symconst_type_size(),
		symconst_type_align(),
		symconst_addr_ent(),
		symconst_ofs_ent(),
		symconst_enum_const();
		public final int val;

		private static class C {
			static int next_val;
		}

		symconst_kind(int val) {
			this.val = val;
			C.next_val = val + 1;
		}

		symconst_kind() {
			this.val = C.next_val++;
		}

		public static symconst_kind getEnum(int val) {
			for (symconst_kind entry : values()) {
				if (val == entry.val)
					return entry;
			}
			return null;
		}
	}

	public static enum ir_where_alloc {
		stack_alloc(),
		heap_alloc();
		public final int val;

		private static class C {
			static int next_val;
		}

		ir_where_alloc(int val) {
			this.val = val;
			C.next_val = val + 1;
		}

		ir_where_alloc() {
			this.val = C.next_val++;
		}

		public static ir_where_alloc getEnum(int val) {
			for (ir_where_alloc entry : values()) {
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
		ir_bk_inner_trampoline();
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

	public static enum pn_generic {
		pn_Generic_M(0),
		pn_Generic_X_regular(1),
		pn_Generic_X_except(2),
		pn_Generic_other(3);
		public final int val;

		private static class C {
			static int next_val;
		}

		pn_generic(int val) {
			this.val = val;
			C.next_val = val + 1;
		}

		pn_generic() {
			this.val = C.next_val++;
		}

		public static pn_generic getEnum(int val) {
			for (pn_generic entry : values()) {
				if (val == entry.val)
					return entry;
			}
			return null;
		}
	}

	public static enum ir_value_classify_sign {
		value_classified_unknown(0),
		value_classified_positive(1),
		value_classified_negative(-1);
		public final int val;

		private static class C {
			static int next_val;
		}

		ir_value_classify_sign(int val) {
			this.val = val;
			C.next_val = val + 1;
		}

		ir_value_classify_sign() {
			this.val = C.next_val++;
		}

		public static ir_value_classify_sign getEnum(int val) {
			for (ir_value_classify_sign entry : values()) {
				if (val == entry.val)
					return entry;
			}
			return null;
		}
	}

	public static enum irg_phase_state {
		phase_building(),
		phase_high(),
		phase_low(),
		phase_backend();
		public final int val;

		private static class C {
			static int next_val;
		}

		irg_phase_state(int val) {
			this.val = val;
			C.next_val = val + 1;
		}

		irg_phase_state() {
			this.val = C.next_val++;
		}

		public static irg_phase_state getEnum(int val) {
			for (irg_phase_state entry : values()) {
				if (val == entry.val)
					return entry;
			}
			return null;
		}
	}

	public static enum irg_outs_state {
		outs_none(),
		outs_consistent(),
		outs_inconsistent();
		public final int val;

		private static class C {
			static int next_val;
		}

		irg_outs_state(int val) {
			this.val = val;
			C.next_val = val + 1;
		}

		irg_outs_state() {
			this.val = C.next_val++;
		}

		public static irg_outs_state getEnum(int val) {
			for (irg_outs_state entry : values()) {
				if (val == entry.val)
					return entry;
			}
			return null;
		}
	}

	public static enum irg_extblk_info_state {
		ir_extblk_info_none(0),
		ir_extblk_info_valid(1),
		ir_extblk_info_invalid(2);
		public final int val;

		private static class C {
			static int next_val;
		}

		irg_extblk_info_state(int val) {
			this.val = val;
			C.next_val = val + 1;
		}

		irg_extblk_info_state() {
			this.val = C.next_val++;
		}

		public static irg_extblk_info_state getEnum(int val) {
			for (irg_extblk_info_state entry : values()) {
				if (val == entry.val)
					return entry;
			}
			return null;
		}
	}

	public static enum irg_dom_state {
		dom_none(),
		dom_consistent(),
		dom_inconsistent();
		public final int val;

		private static class C {
			static int next_val;
		}

		irg_dom_state(int val) {
			this.val = val;
			C.next_val = val + 1;
		}

		irg_dom_state() {
			this.val = C.next_val++;
		}

		public static irg_dom_state getEnum(int val) {
			for (irg_dom_state entry : values()) {
				if (val == entry.val)
					return entry;
			}
			return null;
		}
	}

	public static enum irg_loopinfo_state {
		loopinfo_none(0),
		loopinfo_constructed(1),
		loopinfo_valid(2),
		loopinfo_cf(4),
		loopinfo_inter(8),
		loopinfo_consistent((irg_loopinfo_state.loopinfo_constructed.val | irg_loopinfo_state.loopinfo_valid.val)),
		loopinfo_inconsistent(irg_loopinfo_state.loopinfo_constructed.val),
		loopinfo_ip_consistent(((irg_loopinfo_state.loopinfo_constructed.val | irg_loopinfo_state.loopinfo_inter.val) | irg_loopinfo_state.loopinfo_valid.val)),
		loopinfo_ip_inconsistent((irg_loopinfo_state.loopinfo_constructed.val | irg_loopinfo_state.loopinfo_inter.val)),
		loopinfo_cf_consistent(((irg_loopinfo_state.loopinfo_constructed.val | irg_loopinfo_state.loopinfo_cf.val) | irg_loopinfo_state.loopinfo_valid.val)),
		loopinfo_cf_inconsistent((irg_loopinfo_state.loopinfo_constructed.val | irg_loopinfo_state.loopinfo_cf.val)),
		loopinfo_cf_ip_consistent((((irg_loopinfo_state.loopinfo_constructed.val | irg_loopinfo_state.loopinfo_cf.val) | irg_loopinfo_state.loopinfo_inter.val) | irg_loopinfo_state.loopinfo_valid.val)),
		loopinfo_cf_ip_inconsistent(((irg_loopinfo_state.loopinfo_constructed.val | irg_loopinfo_state.loopinfo_cf.val) | irg_loopinfo_state.loopinfo_inter.val));
		public final int val;

		private static class C {
			static int next_val;
		}

		irg_loopinfo_state(int val) {
			this.val = val;
			C.next_val = val + 1;
		}

		irg_loopinfo_state() {
			this.val = C.next_val++;
		}

		public static irg_loopinfo_state getEnum(int val) {
			for (irg_loopinfo_state entry : values()) {
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

	public static enum irg_inline_property {
		irg_inline_any(),
		irg_inline_forbidden(),
		irg_inline_recomended(),
		irg_inline_forced(),
		irg_inline_forced_no_body();
		public final int val;

		private static class C {
			static int next_val;
		}

		irg_inline_property(int val) {
			this.val = val;
			C.next_val = val + 1;
		}

		irg_inline_property() {
			this.val = C.next_val++;
		}

		public static irg_inline_property getEnum(int val) {
			for (irg_inline_property entry : values()) {
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
		IR_RESOURCE_PHI_LIST((1 << 5)),
		IR_RESOURCE_IRG_LINK((1 << 6)),
		IR_RESOURCE_ENTITY_LINK((1 << 8)),
		IR_RESOURCE_TYPE_VISITED((1 << 9)),
		IR_RESOURCE_LOCAL_MASK(0x00FF),
		IR_RESOURCE_GLOBAL_MASK(0xFF00);
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

	public static enum ir_graph_state_t {
		IR_GRAPH_STATE_KEEP_MUX((1 << 0)),
		IR_GRAPH_STATE_ARCH_DEP((1 << 1)),
		IR_GRAPH_STATE_BCONV_ALLOWED((1 << 2));
		public final int val;

		private static class C {
			static int next_val;
		}

		ir_graph_state_t(int val) {
			this.val = val;
			C.next_val = val + 1;
		}

		ir_graph_state_t() {
			this.val = C.next_val++;
		}

		public static ir_graph_state_t getEnum(int val) {
			for (ir_graph_state_t entry : values()) {
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
		IR_SEGMENT_LAST(ir_segment_t.IR_SEGMENT_DESTRUCTORS.val);
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


	public static native void irp_reserve_resources(Pointer irp, /* ir_resources_t */int resources);

	public static native void irp_free_resources(Pointer irp, /* ir_resources_t */int resources);

	public static native /* ir_resources_t */int irp_resources_reserved(Pointer irp);

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

	public static native void add_irp_irg(Pointer irg);

	public static native void remove_irp_irg_from_list(Pointer irg);

	public static native void remove_irp_irg(Pointer irg);

	public static native int get_irp_last_idx();

	public static native com.sun.jna.NativeLong get_irp_n_irgs();

	public static native Pointer get_irp_irg(com.sun.jna.NativeLong pos);

	public static native void set_irp_irg(com.sun.jna.NativeLong pos, Pointer irg);

	public static native Pointer get_segment_type(/* ir_segment_t */int segment);

	public static native void set_segment_type(/* ir_segment_t */int segment, Pointer new_type);

	public static native Pointer get_glob_type();

	public static native Pointer get_tls_type();

	public static native void add_irp_type(Pointer typ);

	public static native void remove_irp_type(Pointer typ);

	public static native com.sun.jna.NativeLong get_irp_n_types();

	public static native Pointer get_irp_type(com.sun.jna.NativeLong pos);

	public static native void set_irp_type(com.sun.jna.NativeLong pos, Pointer typ);

	public static native com.sun.jna.NativeLong get_irp_n_modes();

	public static native Pointer get_irp_mode(com.sun.jna.NativeLong pos);

	public static native void add_irp_opcode(Pointer opcode);

	public static native void remove_irp_opcode(Pointer opcode);

	public static native com.sun.jna.NativeLong get_irp_n_opcodes();

	public static native Pointer get_irp_opcode(com.sun.jna.NativeLong pos);

	public static native void clear_irp_opcodes_generic_func();

	public static native Pointer get_const_code_irg();

	public static native /* irg_phase_state */int get_irp_phase_state();

	public static native void set_irp_phase_state(/* irg_phase_state */int s);

	public static native /* irg_outs_state */int get_irp_ip_outs_state();

	public static native void set_irp_ip_outs_inconsistent();

	public static native Pointer set_irp_phase_state_pass(String name, /* irg_phase_state */int state);

	public static native /* irg_callee_info_state */int get_irp_callee_info_state();

	public static native void set_irp_callee_info_state(/* irg_callee_info_state */int s);

	public static native com.sun.jna.NativeLong get_irp_next_region_nr();

	public static native com.sun.jna.NativeLong get_irp_next_label_nr();

	public static native void add_irp_asm(Pointer asm_string);

	public static native com.sun.jna.NativeLong get_irp_n_asms();

	public static native Pointer get_irp_asm(com.sun.jna.NativeLong pos);
}
