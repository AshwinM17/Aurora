# Melting Pot
Unlock the character's binary secrets by deciphering the dance of zeros and ones – pay attention to the rhythm and arrangement of the bits to reveal the hidden data

**The Flag should be wrapped in actf{}**
## Hints
1) Are you ready to mix up all the domains?
## Approach
data.txt file was in actuality a zipped file which on unzipping becomes a stack of gzip,bzip2 and tar archive files,on one by one opening the zipped files and archive we recieve 3 files,
1) data.txt:-
    having the data 
    ```
    Congratulations on unearthing this:-


    @vkvefvhz_eidkmuhehnps_ccuyc
    ```
2) ![Maze](MAZE_image.png)
3) ![alt text](grid.jpg)

on tracing the path in the maze from laft to right and then tracing the same path on the alphabet grid we can obtain a 26 character key for the vignere cipher which is used to encode the insta username in the data.txt file.

**Insta Username:**@forensic_cryptography_osint

On going to the account you can see a post with the comment having 
**S0iFiFlmd_7jV_IjFG1o5_1f_Msv** which when again decoded gives the final flag text

## Key:-
qweasdzxcrfvtgbnhyiuokmljp

# flag:
actf{C0mBiNing_7hE_DoMA1n5_1s_Fun}



