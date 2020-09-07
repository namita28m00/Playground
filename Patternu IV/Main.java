#include<bits/stdc++.h>

using namespace std;

int main()

{

 int m;

 cin>>m;

 for(int i = 1 ; i<=m;i++)

 {

   if(i%2 == 1)

   {

   for(int j=0;j<m-1;j++)

   {

     cout<<i;

   }

     cout<<i+1;

      cout<<"\n";

   }

  else

  {

    cout<<i+1;

    for(int j=0;j<m-1;j++)

   {

     cout<<i;

   }

      cout<<"\n";

  }

   }

 } 