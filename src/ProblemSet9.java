public class ProblemSet9 {

    public int[] evenOdd(int[] arr) {
        if (arr == null) {
            return null;
        } else {
            int[] newArr = new int[100];
            int counter = 0;

            for (int j : arr) {
                if (arr[j] % 2 == 0) {
                    newArr[counter] = arr[j];
                    counter++;
                }
            }

            for (int k : arr) {
                if (arr[k] % 2 != 0) {
                    newArr[counter] = arr[k];
                    counter++;
                }
            }

            return newArr;
        }
    }

    public int[] notAlone(int[] arr, int alone) {
        if (arr == null || arr.length == 0) {
            return null;
        } else {
            for (int j : arr) {
                if (arr[j] == alone) {
                    if (j + 1 < arr.length && arr[j + 1] > arr[j - 1]) {
                        arr[j] = arr[j + 1];
                    } else if (j - 1 > 0 && arr[j - 1] > arr[j + 1]) {
                        arr[j] = arr[j - 1];
                    }
                }
            }

            return arr;
        }
    }

    public int[] shiftLeft(int[] arr) {
        if (arr == null) {
            return null;
        } else if (arr.length == 0) {
            return new int[0];
        } else {
            int[] arr2 = new int[100];
            for (int j : arr) {
                if (j == 0) {
                    arr2[arr.length - 1] = arr[j];
                } else {
                    arr2[j - 1] = arr[j];
                }
            }

            return arr2;
        }
    }

    public int[] fillIn(int start, int end) {
        if (start > end) {
            return null;
        } else {
            if (start == end) {
                return new int[0];
            } else {
                int[] arr = new int[100];
                int counter = 0;
                for (int i = start; i < end; i++) {
                    arr[counter] = i;
                }

                return arr;
            }
        }
    }

    public boolean triple(int[] arr) {
        if (arr == null) {
            return false;
        } else {
            int counter = 0;
            for (int j : arr) {
                if (arr[j] == 3) {
                    counter++;
                }
            }

            return counter == 3;
        }
    }

    public int pairs(int[] a, int[] b) {
        if (a == null || b == null || a.length != b.length) {
            return -1;
        } else {
            int counter = 0;
            for (int j : a) {
                if (b[j] > a[j] && b[j] - a[j] <= 3) {
                    counter++;
                }
            }

            return counter;
        }
    }

    public boolean twentyFour(int[] arr) {
        if (arr == null) {
            return false;
        } else {
            boolean next2 = false;
            boolean next4 = false;

            for (int j : arr) {
                if (arr[j] == 2) {
                    if (arr[j - 1] == arr[j]) {
                        next2 = true;
                    }
                } else if (arr[j] == 4) {
                    if (arr[j - 1] == arr[j]) {
                        next4 = true;
                    }
                }

            }

            if (next2 && !next4) {
                return true;
            } else return !next2 && next4;
        }
    }

    public boolean fourteen(int[] arr) {
        if (arr == null || arr.length == 0) {
            return false;
        } else {
            for (int j : arr) {
                if (arr[j] != 1 || arr[j] != 4) {
                    return false;
                }
            }

            return true;
        }
    }

    public int centeredAverage(int[] arr) {
        if (arr == null || arr.length < 3) {
            return -1;
        } else {
            int sum = 0;

            for (int j = 1; j < arr.length - 1; j++) {
                sum += arr[j];
            }

            return sum / (arr.length - 2);
        }
    }

    public int outliers(int[] arr) {
        if (arr == null || arr.length < 1) {
            return -1;
        } else {
            int largest = 0;
            int smallest = 0;

            for (int j : arr) {
                if (j == 0) {
                    largest = arr[j];
                } else {
                    if (arr[j] > largest) {
                        largest = arr[j];
                    }
                }
            }

            for (int k : arr) {
                if (k == 0) {
                    smallest = arr[k];
                } else {
                    if (arr[k] < smallest) {
                        smallest = arr[k];
                    }
                }
            }

            return largest - smallest;
        }
    }
}