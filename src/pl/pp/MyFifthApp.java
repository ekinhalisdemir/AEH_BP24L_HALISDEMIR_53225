public static void main() {
    printCharacter('X', 4, 2);
}

public static void printCharacter(char character, int numberInRow, int numberOfLines) {
    for (int i = 0; i < numberOfLines; i++) {
        for (int j = 0; j < numberInRow; j++) {
            System.out.print(character);
        }
        System.out.println();
    }
}
