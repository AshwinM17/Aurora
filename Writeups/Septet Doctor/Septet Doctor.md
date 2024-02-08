## Question
I wish someone would gift me a binary clock for valentines day

**The Flag should be wrapped in ACTF{}**

## Hints
1) Think about the layers of an onion, each layer needs to be peeled back t reveal the next
2) File inside file? You always don't need a password to access different layers, you can do this with a tool !
## Approach
We had to extract an image from inside this image to get another image of a binary clock using  tools like **STEGOSUITE**,you had to change the extension of the 2nd image from .jpeg to .jpg as stegosuite works on jpg,png etc not on jpeg,

after extracting the data once again from the 2nd image you would revieve a cipher text
```
IbOIbo8q1O0O8o8||oqIq0qI\\o8oO0dpIp//bo//8Oo8oO//8//o/|\||o1o8oOo88o/|\\|/IP0oOoO0odbIp//I8I18o8o81II1pI/|\I\|/o8o0Oq8/|\po8||oO8oO0OIb//O//0q\|/O8oOoq1qI0//I18o18ooOOdbo\\d10/|\b88oO0oOo\\//0q\\1oOoO8o1pIpII1POdo8OoodpdPO8qI0O8O8ooOOd\|/0qI1P08OOdIO0\\0bq/|\oOO800bo/|\I80o\\oO008O0IbqpIb11IbooO8dIdI0//\\OOqO88oq8I/|\\\\\//bo8o8Ib//0//Io//%8O8oOOOq\|/I8//88oO8||oI1O\\1boq8O8oqPqIq//I//po8O0d811\|/oqI//oO8OOdId1oI\|/1\|/88oO8ooo1IIpI\|/o
```
this cipher text is encoded by binary shape character cipher which on decoding gave us
```
11001100000110000000011001101001111000000011011011100110000000011001101111101000000000001111111100000000011011011100110000000011111011111111000000010011110000110000000011011011001111000000011011011110001000000011001101101111000000000001111001111000000011011011110001000000011001100000110000000000001111001111000000011001101001111000000010011110000110000000011001101101111000000011011011110001000000010011111111111000000011011011101101000000000001111100110000000011011011110001000000011001101111111000000010011111001111000000011011011111111000000000001111011110
```
which is a 7-segment display cipher(used to program the led numberical lights)
which gives us cipher text in hex 
```
41 43 54 46 7b 54 68 31 53 5F 49 73 5F 41 73 43 31 49 5F 38 55 74 5F 48 33 58 7d
```
which on converting hex to ascii we get the flag
## Flag
ACTF{Th1S_Is_AsC1I_8Ut_H3X}
