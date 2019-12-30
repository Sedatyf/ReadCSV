# ReadCSV Wip Branch
## This branch is to keep my work in progress file

I'm currently trying to link parameters to CSV

I can read CSV and have N testcases for N lines in my CSV

But if I syso one column, it prints only the first one of my CSV and not the N+1, N+2, N+x according to the testcase

*Example :*
My CSV file is like this :
```
ID, firstname, lastname
1, jean-michel, testeur
2, michel, autom
3, josiane, compta
```

So, right now, my code understand that I need to run 3 testcases because I have 3 line
But when you print values from the testcase, it only prints **jean-michel** when you call the column **firstname** 