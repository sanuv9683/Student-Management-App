/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.ijse.ijsetrans.other;

/**
 *
 * @author Sanu Vithanage
 */
public class PassManager {
    public static String encriptMyPass(String pass) {
        String str, Newstr = " ";
        try {
            str = pass;
            for (int i = 0; i < str.length(); i++) {
                char ch = Character.toLowerCase(str.charAt(i));
                switch (ch) {
                    case 'a':
                        Newstr = Newstr + "{";
                        break;
                    case 'b':
                        Newstr = Newstr + "}";
                        break;
                    case 'c':
                        Newstr = Newstr + "#";
                        break;
                    case 'd':
                        Newstr = Newstr + "~";
                        break;
                    case 'e':
                        Newstr = Newstr + "+";
                        break;
                    case 'f':
                        Newstr = Newstr + "-";
                        break;
                    case 'g':
                        Newstr = Newstr + "*";
                        break;
                    case 'h':
                        Newstr = Newstr + "@";
                        break;
                    case 'i':
                        Newstr = Newstr + "/";
                        break;
                    case 'j':
                        Newstr = Newstr + "\\";
                        break;
                    case 'k':
                        Newstr = Newstr + "?";
                        break;
                    case 'l':
                        Newstr = Newstr + "$";
                        break;
                    case 'm':
                        Newstr = Newstr + "!";
                        break;
                    case 'n':
                        Newstr = Newstr + "^";
                        break;
                    case 'o':
                        Newstr = Newstr + "(";
                        break;
                    case 'p':
                        Newstr = Newstr + ")";
                        break;
                    case 'q':
                        Newstr = Newstr + "<";
                        break;
                    case 'r':
                        Newstr = Newstr + ">";
                        break;
                    case 's':
                        Newstr = Newstr + "=";
                        break;
                    case 't':
                        Newstr = Newstr + ";";
                        break;
                    case 'u':
                        Newstr = Newstr + ",";
                        break;
                    case 'v':
                        Newstr = Newstr + "_";
                        break;
                    case 'w':
                        Newstr = Newstr + "[";
                        break;
                    case 'x':
                        Newstr = Newstr + "]";
                        break;
                    case 'y':
                        Newstr = Newstr + ":";
                        break;
                    case 'z':
                        Newstr = Newstr + "\"";
                        break;
                    case ' ':
                        Newstr = Newstr + " ";
                        break;
                    case '.':
                        Newstr = Newstr + '3';
                        break;
                    case ',':
                        Newstr = Newstr + "1";
                        break;
                    case '(':
                        Newstr = Newstr + '4';
                        break;
                    case '\"':
                        Newstr = Newstr + '5';
                        break;
                    case ')':
                        Newstr = Newstr + "7";
                        break;
                    case '?':
                        Newstr = Newstr + "2";
                        break;
                    case '!':
                        Newstr = Newstr + "8";
                        break;
                    case '-':
                        Newstr = Newstr + "6";
                        break;
                    case '%':
                        Newstr = Newstr + "9";
                        break;
                    case '1':
                        Newstr = Newstr + "r";
                        break;
                    case '2':
                        Newstr = Newstr + "k";
                        break;
                    case '3':
                        Newstr = Newstr + "b";
                        break;
                    case '4':
                        Newstr = Newstr + "e";
                        break;
                    case '5':
                        Newstr = Newstr + "q";
                        break;
                    case '6':
                        Newstr = Newstr + "h";
                        break;
                    case '7':
                        Newstr = Newstr + "u";
                        break;
                    case '8':
                        Newstr = Newstr + "y";
                        break;
                    case '9':
                        Newstr = Newstr + "w";
                        break;
                    case '0':
                        Newstr = Newstr + "z";
                        break;
                    default:
                        Newstr = Newstr + "0";
                        break;
                }
            }
        } catch (Exception ioe) {
            ioe.printStackTrace();
        }
        System.out.println("The encrypted string is: \n" + Newstr);
        return Newstr;
    }

    public static String decriptMyPass(String pass) {
        String str, Newstr = " ";
        try {
            str = pass;
            for (int i = 0; i < str.length(); i++) {
                char ch = Character.toLowerCase(str.charAt(i));
                switch (ch) {
                    case '{':
                        Newstr = Newstr + "A";
                        break;
                    case '}':
                        Newstr = Newstr + "B";
                        break;
                    case '#':
                        Newstr = Newstr + "C";
                        break;
                    case '~':
                        Newstr = Newstr + "D";
                        break;
                    case '+':
                        Newstr = Newstr + "E";
                        break;
                    case '-':
                        Newstr = Newstr + "F";
                        break;
                    case '*':
                        Newstr = Newstr + "G";
                        break;
                    case '@':
                        Newstr = Newstr + "H";
                        break;
                    case '/':
                        Newstr = Newstr + "I";
                        break;
                    case '\\':
                        Newstr = Newstr + "J";
                        break;
                    case '?':
                        Newstr = Newstr + "K";
                        break;
                    case '$':
                        Newstr = Newstr + "L";
                        break;
                    case '!':
                        Newstr = Newstr + "M";
                        break;
                    case '^':
                        Newstr = Newstr + "N";
                        break;
                    case '(':
                        Newstr = Newstr + "O";
                        break;
                    case ')':
                        Newstr = Newstr + "P";
                        break;
                    case '<':
                        Newstr = Newstr + "Q";
                        break;
                    case '>':
                        Newstr = Newstr + "R";
                        break;
                    case '=':
                        Newstr = Newstr + "S";
                        break;
                    case ';':
                        Newstr = Newstr + "T";
                        break;
                    case ',':
                        Newstr = Newstr + "U";
                        break;
                    case '_':
                        Newstr = Newstr + "V";
                        break;
                    case '[':
                        Newstr = Newstr + "W";
                        break;
                    case ']':
                        Newstr = Newstr + "X";
                        break;
                    case ':':
                        Newstr = Newstr + "Y";
                        break;
                    case '\"':
                        Newstr = Newstr + "Z";
                        break;
                    case '1':
                        Newstr = Newstr + "r";
                        break;
                    case '2':
                        Newstr = Newstr + "k";
                        break;
                    case '3':
                        Newstr = Newstr + "b";
                        break;
                    case '4':
                        Newstr = Newstr + "e";
                        break;
                    case '5':
                        Newstr = Newstr + "q";
                        break;
                    case '6':
                        Newstr = Newstr + "h";
                        break;
                    case '7':
                        Newstr = Newstr + "u";
                        break;
                    case '8':
                        Newstr = Newstr + "y";
                        break;
                    case '9':
                        Newstr = Newstr + "w";
                        break;
                    case '0':
                        Newstr = Newstr + "z";
                        break;
                    default:
                        Newstr = Newstr + "0";
                        break;
                }
            }
        } catch (Exception ioe) {
            ioe.printStackTrace();
        }
        System.out.println("The decrypted string is: " + Newstr.toLowerCase());
        return Newstr;
    }
}
