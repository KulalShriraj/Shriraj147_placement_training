#include <stdio.h>
#include <stdlib.h>

int main()
{
    int no_vehicle,no_wheels=0,two_wh,four_wh;
    scanf("%d%d",&no_vehicle,&no_wheels);
    four_wh=(no_wheels-2*no_vehicle)/2;
    two_wh=no_vehicle-four_wh;
    printf("TW=%d FW=%d",two_wh,four_wh);
    return 0;
}
