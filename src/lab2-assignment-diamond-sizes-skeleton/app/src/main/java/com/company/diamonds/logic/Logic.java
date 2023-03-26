package com.company.diamonds.logic;

import com.company.diamonds.ui.OutputInterface;

/**
 * This is where the logic of this App is centralized for this assignment.
 * <p>
 * The assignments are designed this way to simplify your early
 * Android interactions.  Designing the assignments this way allows
 * you to first learn key 'Java' features without having to beforehand
 * learn the complexities of Android.
 */
public class Logic
       implements LogicInterface {
    /**
     * This is a String to be used in Logging (if/when you decide you
     * need it for debugging).
     */
    public static final String TAG = Logic.class.getName();

    /**
     * This is the variable that stores our OutputInterface instance.
     * <p>
     * This is how we will interact with the User Interface [MainActivity.java].
     * <p>
     * It is called 'out' because it is where we 'out-put' our
     * results. (It is also the 'in-put' from where we get values
     * from, but it only needs 1 name, and 'out' is good enough).
     */
    private OutputInterface mOut;

    /**
     * This is the constructor of this class.
     * <p>
     * It assigns the passed in [MainActivity] instance (which
     * implements [OutputInterface]) to 'out'.
     */
    public Logic(OutputInterface out){
        mOut = out;
    }

    /**
     * This is the method that will (eventually) get called when the
     * on-screen button labeled 'Process...' is pressed.
     */
    public void process(int size) {

        // TODO -- add your code here
        int h = size * 2 + 1;
        int w = size * 2 + 2;
        int mir = -(size + 1);
        int Middle = size + 1;
        int top = 1;
        int bottom = size * 2 + 1;

        for(int i = 1; i <= h; i++)
        {
            mir++;
            for (int j = 1; j <= w; j++)
            {
                if ((i == 1 || i == h) && (j == 1 || j == w)) {
                    mOut.print("+");
                }

                else if ((i == 1 || i == h) && !(j == 1 || j == w)) {
                    mOut.print("-");
                }

                else if ( !(i == 1 || i == h) && (j == 1 || j == w)) {
                    mOut.print("|");
                }

                else {
                    int rhomb;
                    if (mir <= 0) {
                        rhomb = i * 2 - 2;
                    } else {
                        rhomb = (i - mir * 2) * 2 - 2;
                    }
                    int Left = Middle - (rhomb / 2 - 1);
                    int Right = Middle + (rhomb / 2);

                    if (j >= Left && j <= Right) {
                        if (j == Left || j == Right) {
                            if (i > top && i < Middle) {

                                if (j == Left) {
                                    mOut.print("/");
                                } else {
                                    mOut.print("\\");
                                }
                            } else if (i == Middle) {
                                if (j == Left) {
                                    mOut.print("<");
                                } else {
                                    mOut.print(">");
                                }
                            } else if (i < bottom && i > Middle) {

                                if (j == Right) {
                                    mOut.print("/");
                                }
                                else {
                                    mOut.print("\\");
                                }
                            }
                        }

                        else {
                            if (i % 2 == 0){
                                mOut.print("=");
                            }
                            else {
                                mOut.print("-");
                            }
                        }

                    }

                    else {
                        mOut.print(" ");
                    }
                }
            }
            mOut.print("\n");
        }

    }

}
