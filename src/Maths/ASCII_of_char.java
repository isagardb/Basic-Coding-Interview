package Maths;

public class ASCII_of_char {
    public static void main(String[] args) {
        String alpha = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
        char[] res = alpha.toCharArray();
        for (char x : res) {
            System.out.println(x + ": " + (int) x + " "+Character.toLowerCase(x)+": "+(int)Character.toLowerCase(x));
        }

    }
}

/*

A: 65 a: 97
B: 66 b: 98
C: 67 c: 99
D: 68 d: 100
E: 69 e: 101
F: 70 f: 102
G: 71 g: 103
H: 72 h: 104
I: 73 i: 105
J: 74 j: 106
K: 75 k: 107
L: 76 l: 108
M: 77 m: 109
N: 78 n: 110
O: 79 o: 111
P: 80 p: 112
Q: 81 q: 113
R: 82 r: 114
S: 83 s: 115
T: 84 t: 116
U: 85 u: 117
V: 86 v: 118
W: 87 w: 119
X: 88 x: 120
Y: 89 y: 121
Z: 90 z: 122


 */