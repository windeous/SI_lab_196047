SI_lab2_196047

Control flow graph

Cyclomatic complexity
E - N + 2*P = 27-21+2= 8

Multiple Condition

 3.1   if (hr < 0 || hr > 24)
       TX - (-1,30,30)
       FT - (25,30,30)
       FF - (12, 30, 30)
 
 3.2   if (min < 0 || min > 59)
       TX - (12, -1, 30)
       FT - (12, 61, 30)
       FF - (12, 5, 30)
 
 3.3   if (sec >= 0 && sec <= 59)
       FX - (12, 30, -1)
       TT - (12, 30, 30)
       TF - (12, 30, 61)
 
 3.4.  else if (hr == 24 && min == 0 && sec == 0)
       TTT - (24, 0, 0)
       TTF - (24, 0, 1)
       TFX - (24, 30, 30)
       FXX / Не постои
