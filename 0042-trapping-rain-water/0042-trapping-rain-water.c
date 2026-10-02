int trap(int* height, int heightSize) {
    int water = 0;

    int left = 0;
    int right = heightSize - 1;

    int Lmax = 0;
    int Rmax = 0;

    while (left < right) {

        if (height[left] <= height[right]) {

            if (height[left] >= Lmax) {
                Lmax = height[left];
            } 
            else {
                water += Lmax - height[left];
            }

            left++;
        }

        else {

            if (height[right] >= Rmax) {
                Rmax = height[right];
            } 
            else {
                water += Rmax - height[right];
            }

            right--;
        }
    }

    return water;
}