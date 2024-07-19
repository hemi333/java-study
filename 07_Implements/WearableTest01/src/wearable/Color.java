package wearable;

public interface Color {

	/* public static final (생략) */ int RED = 1;
	int GREEN = 2;
	int BLUE = 3;
	int YELLOW = 4;
	int BLACK = 5;

	/* public abstract */ void changeColor(int color);

	String toString(int color);
}
