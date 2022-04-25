package HW;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Stream;

public class TestMassArrayContainsOnly1fnd4 {
    public static Stream<Arguments> dataForContainsOnly1fnd4(){
        List<Arguments> list = new ArrayList<>();
        list.add(Arguments.arguments(new int[]{2, 5, 4, 7, 8}, false));
        list.add(Arguments.arguments(new int[]{1, 1, 4}, true));
        list.add(Arguments.arguments(new int[]{4, 4, 4, 4}, false));
        list.add(Arguments.arguments(new int[]{1, 1, 1, 1, 1, 1}, false));
        return list.stream();
    }

    @ParameterizedTest
    @MethodSource("dataForContainsOnly1fnd4")
    public void massTestContainsOnly1fnd4(int[] in, boolean flag) {
        Assertions.assertEquals(flag, MyClass.arrayContainsOnly1fnd4(in));
    }
}
