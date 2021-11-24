package firm.bindings;

import com.sun.jna.Callback;
import com.sun.jna.LastErrorException;
import com.sun.jna.Native;
import com.sun.jna.Pointer;
import firm.Firm;

public class binding_libc {
	static {
		if (System.getProperty("os.name").startsWith("Windows")) {
			Native.register("msvcrt");
		} else {
			Native.register(Firm.VERSION.getFileName());
		}
	}

	public static native Pointer fopen(String name, String mode);

	public static native void fclose(Pointer file) throws LastErrorException;

	public interface SigHandler extends Callback {
		void callback(int arg);
	}

	public static native SigHandler signal(int signum, SigHandler handler);
}
