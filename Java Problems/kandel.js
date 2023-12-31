class Kandel {
        constructor() {}
        maxSumSubArray(inputarray) {
            let maximum_sum = 0;
            let current_sum = 0;
            for (let i = 0; i < inputarray.length; i++) {
                current_sum = current_sum + inputarray[i];
                if (current_sum > maximum_sum) {
                    maximum_sum = current_sum;
                }
                if (current_sum < 0) {
                    current_sum = 0;
                }
            }
            return maximum_sum;
        }
    }
    const op = new Kandel();
    const inputarray = [5, -4, -2, 6, -1, 4];
    const o = op.maxSumSubArray(inputarray);
    console.log("largest sum of sub array is " + o);