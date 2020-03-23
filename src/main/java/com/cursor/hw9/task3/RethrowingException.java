package main.java.com.cursor.hw9.task3;

public class RethrowingException {

    public void throwFirstException() throws Exception {
        throwSecondException();
    }

    public void throwSecondException() throws Exception {
        throw new Exception();
    }
}
