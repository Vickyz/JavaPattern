public class DuobleCheckLocking {
    private static volatile DuobleCheckLocking instance;

    private DuobleCheckLocking() {}

    private static synchronized DuobleCheckLocking getInstance() {
        if (instance == null)
            synchronized (DuobleCheckLocking.class) {
                if (instance == null) {
                    instance = new DuobleCheckLocking();
                }
            }
        return instance;
    }
}
