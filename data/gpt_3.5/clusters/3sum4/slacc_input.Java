public class ThreeSum {
    public List<List<Integer>> threeSum1(int[] nums) {
        List<List<Integer>> result = new ArrayList<>(); // 1

        if (nums == null || nums.length < 3) { // 2
            return result;
        }

        Arrays.sort(nums); // 3

        for (int i = 0; i < nums.length - 2; i++) { // 4
            if (i == 0 || (i > 0 && nums[i] != nums[i-1])) { // 5
                int left = i + 1; // 6
                int right = nums.length - 1; // 7
                int sum = 0 - nums[i]; // 8

                while (left < right) { // 9
                    if (nums[left] + nums[right] == sum) { // 10
                        result.add(Arrays.asList(nums[i], nums[left], nums[right])); // 11

                        while (left < right && nums[left] == nums[left+1]) { // 12
                            left++; // 13
                        }

                        while (left < right && nums[right] == nums[right-1]) { // 14
                            right--; // 15
                        }

                        left++; // 16
                        right--; // 17
                    } else if (nums[left] + nums[right] < sum) { // 18
                        left++; // 19
                    } else { // 20
                        right--; // 21
                    }
                }
            }
        }

        return result;
    }




    public List<List<Integer>> threeSum2(int[] nums) {
        List<List<Integer>> result = new ArrayList<>(); // 22

        if (nums == null || nums.length < 3) // 23
            return result;

        Arrays.sort(nums); // 24

        for (int i = 0; i < nums.length - 2; i++) { // 25
            if (i > 0 && nums[i] == nums[i - 1]) // 26
                continue; // 27

            int left = i + 1; // 28
            int right = nums.length - 1; // 29
            int target = -nums[i]; // 30

            while (left < right) { // 31
                if (nums[left] + nums[right] == target) { // 32
                    result.add(Arrays.asList(nums[i], nums[left], nums[right])); // 33
                    left++; // 34
                    right--; // 35

                    while (left < right && nums[left] == nums[left - 1]) // 36
                        left++; // 37

                    while (left < right && nums[right] == nums[right + 1]) // 38
                        right--; // 39
                } else if (nums[left] + nums[right] < target) // 40
                    left++; // 41
                else // 42
                    right--; // 43
            }
        }

        return result;
    }


    public List<List<Integer>> threeSum3(int[] nums) {
        Arrays.sort(nums); // 44
        List<List<Integer>> result = new ArrayList<>(); // 45

        for (int i = 0; i < nums.length - 2; i++) { // 46
            if (i == 0 || (i > 0 && nums[i] != nums[i - 1])) { // 47
                int left = i + 1; // 48
                int right = nums.length - 1; // 49
                int target = 0 - nums[i]; // 50
                while (left < right) { // 51
                    if (nums[left] + nums[right] == target) { // 52
                        result.add(Arrays.asList(nums[i], nums[left], nums[right])); // 53
                        while (left < right && nums[left] == nums[left + 1]) left++; // 54
                        while (left < right && nums[right] == nums[right - 1]) right--; // 55
                        left++; // 56
                        right--; // 57
                    } else if (nums[left] + nums[right] < target) { // 58
                        left++; // 59
                    } else { // 60
                        right--; // 61
                    }
                }
            }
        }
        return result;
    }





    public List<List<Integer>> threeSum4(int[] nums) {
        List<List<Integer>> result = new ArrayList<>(); // 62

        // Sort the array // 63
        Arrays.sort(nums); // 64

        for (int i = 0; i < nums.length - 2; i++) { // 65
            if (i > 0 && nums[i] == nums[i - 1]) { // 66
                continue; // Skip duplicate elements // 67
            }

            int left = i + 1; // Next element // 68
            int right = nums.length - 1; // Last element // 69

            while (left < right) { // 70
                int sum = nums[i] + nums[left] + nums[right]; // 71
                if (sum == 0) { // 72
                    List<Integer> triplet = Arrays.asList(nums[i], nums[left], nums[right]); // 73
                    result.add(triplet); // 74

                    // Skip duplicate elements // 75
                    while (left < right && nums[left] == nums[left + 1]) { // 76
                        left++; // 77
                    }
                    while (left < right && nums[right] == nums[right - 1]) { // 78
                        right--; // 79
                    }

                    left++; // Move to next unique element // 80
                    right--; // Move to previous unique element // 81
                } else if (sum < 0) { // 82
                    left++; // Sum is too small, increase left pointer // 83
                } else { // 84
                    right--; // Sum is too large, decrease right pointer // 85
                }
            }
        }

        return result;
    }



    public List<List<Integer>> threeSum5(int[] nums) {
        List<List<Integer>> result = new ArrayList<>(); // 86
        Arrays.sort(nums); // 87
        for (int i = 0; i < nums.length - 2; i++) { // 88
            if (i > 0 && nums[i] == nums[i - 1]) { // 89
                continue; // 90
            }
            int j = i + 1; // 91
            int k = nums.length - 1; // 92
            while (j < k) { // 93
                int sum = nums[i] + nums[j] + nums[k]; // 94
                if (sum == 0) { // 95
                    result.add(Arrays.asList(nums[i], nums[j], nums[k])); // 96
                    j++; // 97
                    k--; // 98
                    while (j < k && nums[j] == nums[j - 1]) { // 99
                        j++; // 100
                    }
                    while (j < k && nums[k] == nums[k + 1]) { // 101
                        k--; // 102
                    }
                } else if (sum < 0) { // 103
                    j++; // 104
                } else { // 105
                    k--; // 106
                }
            }
        }
        return result;
    }



    public List<List<Integer>> threeSum6(int[] nums) {
        List<List<Integer>> result = new ArrayList<>(); // 107

        Arrays.sort(nums); // 108

        for (int i = 0; i < nums.length - 2; i++) { // 109
            if (i == 0 || (i > 0 && nums[i] != nums[i - 1])) { // 110
                int low = i + 1, high = nums.length - 1, sum = 0 - nums[i]; // 111

                while (low < high) { // 112
                    if (nums[low] + nums[high] == sum) { // 113
                        result.add(Arrays.asList(nums[i], nums[low], nums[high])); // 114

                        while (low < high && nums[low] == nums[low + 1]) low++; // 115
                        while (low < high && nums[high] == nums[high - 1]) high--; // 116

                        low++; // 117
                        high--; // 118
                    } else if (nums[low] + nums[high] < sum) { // 119
                        low++; // 120
                    } else { // 121
                        high--; // 122
                    }
                }
            }
        }

        return result;
    }



    public List<List<Integer>> threeSum7(int[] nums) {
        List<List<Integer>> result = new ArrayList<>(); // 123
        Arrays.sort(nums); // 124

        for (int i = 0; i < nums.length - 2; i++) { // 125
            if (i > 0 && nums[i] == nums[i - 1]) { // 126
                continue; // 127
            }

            int j = i + 1; // 128
            int k = nums.length - 1; // 129

            while (j < k) { // 130
                int sum = nums[i] + nums[j] + nums[k]; // 131

                if (sum < 0) { // 132
                    j++; // 133
                } else if (sum > 0) { // 134
                    k--; // 135
                } else { // 136
                    result.add(Arrays.asList(nums[i], nums[j], nums[k])); // 137

                    while (j < k && nums[j] == nums[j + 1]) { // 138
                        j++; // 139
                    }
                    while (j < k && nums[k] == nums[k - 1]) { // 140
                        k--; // 141
                    }

                    j++; // 142
                    k--; // 143
                }
            }
        }

        return result;
    }



    public List<List<Integer>> threeSum8(int[] nums) {
        List<List<Integer>> res = new ArrayList<>(); // 144
        if(nums == null || nums.length == 0) { // 145
            return res;
        }
        Arrays.sort(nums); // 146

        for(int i = 0; i < nums.length - 2; i++) { // 147
            if(i > 0 && nums[i] == nums[i-1]) { // 148
                continue; // 149
            }
            int target = 0 - nums[i]; // 150
            int left = i + 1; // 151
            int right = nums.length - 1; // 152

            while(left < right) { // 153
                if(nums[left] + nums[right] == target) { // 154
                    res.add(Arrays.asList(nums[i], nums[left], nums[right])); // 155
                    left++; // 156
                    right--; // 157
                    while(left < right && nums[left] == nums[left-1]) { // 158
                        left++; // 159
                    }
                    while(left < right && nums[right] == nums[right+1]) { // 160
                        right--; // 161
                    }
                }
                else if(nums[left] + nums[right] < target) { // 162
                    left++; // 163
                }
                else { // 164
                    right--; // 165
                }
            }
        }
        return res;
    }

    public List<List<Integer>> threeSum9(int[] nums) {
        List<List<Integer>> result = new ArrayList<>(); // 166

        if (nums == null || nums.length < 3) { // 167
            return result;
        }

        Arrays.sort(nums); // 168

        for (int i = 0; i < nums.length - 2; i++) { // 169
            if (i > 0 && nums[i] == nums[i - 1]) { // 170
                continue; // 171
            }

            int left = i + 1; // 172
            int right = nums.length - 1; // 173
            int target = -nums[i]; // 174

            while (left < right) { // 175
                int sum = nums[left] + nums[right]; // 176

                if (sum == target) { // 177
                    result.add(Arrays.asList(nums[i], nums[left], nums[right])); // 178
                    left++; // 179
                    right--; // 180

                    while (left < right && nums[left] == nums[left - 1]) { // 181
                        left++; // 182
                    }

                    while (left < right && nums[right] == nums[right + 1]) { // 183
                        right--; // 184
                    }
                } else if (sum > target) { // 185
                    right--; // 186
                } else { // 187
                    left++; // 188
                }
            }
        }

        return result;
    }



    public List<List<Integer>> threeSum10(int[] nums) {
        List<List<Integer>> result = new ArrayList<>(); // 189

        if (nums == null || nums.length < 3) { // 190
            return result;
        }

        Arrays.sort(nums); // 191

        for (int i = 0; i < nums.length - 2; i++) { // 192
            if (i > 0 && nums[i] == nums[i - 1]) { // 193
                continue; // skip duplicate numbers // 194
            }

            int target = -nums[i]; // 195
            int left = i + 1; // 196
            int right = nums.length - 1; // 197

            while (left < right) { // 198
                int sum = nums[left] + nums[right]; // 199

                if (sum == target) { // 200
                    result.add(Arrays.asList(nums[i], nums[left], nums[right])); // 201

                    while (left < right && nums[left] == nums[left + 1]) { // 202
                        left++; // skip duplicate numbers // 203
                    }
                    while (left < right && nums[right] == nums[right - 1]) { // 204
                        right--; // skip duplicate numbers // 205
                    }

                    left++; // 206
                    right--; // 207
                } else if (sum < target) { // 208
                    left++; // 209
                } else { // 210
                    right--; // 211
                }
            }
        }

        return result;
    }

    public List<List<Integer>> threeSum11(int[] nums) {
        Arrays.sort(nums); // 212
        List<List<Integer>> result = new ArrayList<>(); // 213

        for (int i = 0; i < nums.length - 2; i++) { // 214
            if (i == 0 || (i > 0 && nums[i] != nums[i-1])) { // 215
                int low = i + 1; // 216
                int high = nums.length - 1; // 217
                int sum = 0 - nums[i]; // 218

                while (low < high) { // 219
                    if (nums[low] + nums[high] == sum) { // 220
                        result.add(Arrays.asList(nums[i], nums[low], nums[high])); // 221
                        while (low < high && nums[low] == nums[low+1]) { // 222
                            low++; // 223
                        }
                        while (low < high && nums[high] == nums[high-1]) { // 224
                            high--; // 225
                        }
                        low++; // 226
                        high--; // 227
                    } else if (nums[low] + nums[high] < sum) { // 228
                        low++; // 229
                    } else { // 230
                        high--; // 231
                    }
                }
            }
        }

        return result;
    }

    public List<List<Integer>> threeSum12(int[] nums) {
        List<List<Integer>> result = new ArrayList<>(); // 232
        Arrays.sort(nums); // 233
        for (int i = 0; i < nums.length - 2; i++) { // 234
            if (i > 0 && nums[i] == nums[i - 1]) { // 235
                continue; // 236
            }
            int left = i + 1; // 237
            int right = nums.length - 1; // 238
            while (left < right) { // 239
                int sum = nums[i] + nums[left] + nums[right]; // 240
                if (sum == 0) { // 241
                    result.add(Arrays.asList(nums[i], nums[left], nums[right])); // 242
                    while (left < right && nums[left] == nums[left + 1]) { // 243
                        left++; // 244
                    }
                    while (left < right && nums[right] == nums[right - 1]) { // 245
                        right--; // 246
                    }
                    left++; // 247
                    right--; // 248
                } else if (sum < 0) { // 249
                    left++; // 250
                } else { // 251
                    right--; // 252
                }
            }
        }
        return result;
    }




    public List<List<Integer>> threeSum13(int[] nums) {
        Arrays.sort(nums); // 253
        List<List<Integer>> result = new ArrayList<>(); // 254

        for (int i = 0; i < nums.length - 2; i++) { // 255
            if (i > 0 && nums[i] == nums[i - 1]) { // 256
                continue; // 257
            }
            int target = -nums[i]; // 258
            int left = i + 1; // 259
            int right = nums.length - 1; // 260

            while (left < right) { // 261
                if (nums[left] + nums[right] == target) { // 262
                    result.add(Arrays.asList(nums[i], nums[left], nums[right])); // 263
                    left++; // 264
                    right--; // 265

                    while (left < right && nums[left] == nums[left - 1]) { // 266
                        left++; // 267
                    }
                    while (left < right && nums[right] == nums[right + 1]) { // 268
                        right--; // 269
                    }
                } else if (nums[left] + nums[right] < target) { // 270
                    left++; // 271
                } else { // 272
                    right--; // 273
                }
            }
        }

        return result;
    }

    public List<List<Integer>> threeSum14(int[] nums) {
        List<List<Integer>> result = new ArrayList<>(); // 274
        if (nums == null || nums.length < 3) { // 275
            return result;
        }
        Arrays.sort(nums); // 276
        for (int i = 0; i < nums.length - 2; i++) { // 277
            if (i > 0 && nums[i] == nums[i - 1]) { // 278
                continue; // 279
            }
            int left = i + 1; // 280
            int right = nums.length - 1; // 281
            while (left < right) { // 282
                int sum = nums[i] + nums[left] + nums[right]; // 283
                if (sum == 0) { // 284
                    result.add(Arrays.asList(nums[i], nums[left], nums[right])); // 285
                    while (left < right && nums[left] == nums[left + 1]) { // 286
                        left++; // 287
                    }
                    while (left < right && nums[right] == nums[right - 1]) { // 288
                        right--; // 289
                    }
                    left++; // 290
                    right--; // 291
                } else if (sum < 0) { // 292
                    left++; // 293
                } else { // 294
                    right--; // 295
                }
            }
        }
        return result;
    }

    public List<List<Integer>> threeSum15(int[] nums) {
        List<List<Integer>> result = new ArrayList<>(); // 296

        Arrays.sort(nums); // 297

        for (int i = 0; i < nums.length - 2; i++) { // 298
            if (i > 0 && nums[i] == nums[i - 1]) { // 299
                continue; // 300
            }

            int left = i + 1; // 301
            int right = nums.length - 1; // 302

            while (left < right) { // 303
                int sum = nums[i] + nums[left] + nums[right]; // 304

                if (sum < 0) { // 305
                    left++; // 306
                } else if (sum > 0) { // 307
                    right--; // 308
                } else { // 309
                    result.add(Arrays.asList(nums[i], nums[left], nums[right])); // 310

                    while (left < right && nums[left] == nums[left + 1]) { // 311
                        left++; // 312
                    }

                    while (left < right && nums[right] == nums[right - 1]) { // 313
                        right--; // 314
                    }

                    left++; // 315
                    right--; // 316
                }
            }
        }

        return result;
    }

    public List<List<Integer>> threeSum16(int[] nums) {
        List<List<Integer>> result = new ArrayList<>(); // 317

        if (nums == null || nums.length < 3) // 318
            return result;

        Arrays.sort(nums); // 319

        for (int i = 0; i < nums.length - 2; i++) { // 320
            if (i > 0 && nums[i] == nums[i - 1]) // 321
                continue; // 322

            int left = i + 1; // 323
            int right = nums.length - 1; // 324

            while (left < right) { // 325
                int sum = nums[i] + nums[left] + nums[right]; // 326

                if (sum < 0) // 327
                    left++; // 328
                else if (sum > 0) // 329
                    right--; // 330
                else { // 331
                    result.add(Arrays.asList(nums[i], nums[left], nums[right])); // 332
                    left++; // 333
                    right--; // 334

                    while (left < right && nums[left] == nums[left - 1]) // 335
                        left++; // 336

                    while (left < right && nums[right] == nums[right + 1]) // 337
                        right--; // 338
                }
            }
        }

        return result;
    }



    public List<List<Integer>> threeSum17(int[] nums) {
        List<List<Integer>> result = new ArrayList<>(); // 339
        Arrays.sort(nums); // 340

        for (int i = 0; i < nums.length - 2; i++) { // 341
            if (i > 0 && nums[i] == nums[i - 1]) { // 342
                continue; // 343
            }

            int left = i + 1; // 344
            int right = nums.length - 1; // 345

            while (left < right) { // 346
                int sum = nums[i] + nums[left] + nums[right]; // 347

                if (sum == 0) { // 348
                    result.add(Arrays.asList(nums[i], nums[left], nums[right])); // 349
                    left++; // 350
                    right--; // 351

                    while (left < right && nums[left] == nums[left - 1]) { // 352
                        left++; // 353
                    }

                    while (left < right && nums[right] == nums[right + 1]) { // 354
                        right--; // 355
                    }
                } else if (sum < 0) { // 356
                    left++; // 357
                } else { // 358
                    right--; // 359
                }
            }
        }

        return result;
    }


    public List<List<Integer>> threeSum18(int[] nums) {
        List<List<Integer>> result = new ArrayList<>(); // 360

        Arrays.sort(nums); // 361

        for (int i = 0; i < nums.length - 2; i++) { // 362
            if (i > 0 && nums[i] == nums[i - 1]) { // 363
                continue; // 364
            }

            int left = i + 1; // 365
            int right = nums.length - 1; // 366
            int target = -nums[i]; // 367

            while (left < right) { // 368
                if (nums[left] + nums[right] == target) { // 369
                    result.add(Arrays.asList(nums[i], nums[left], nums[right])); // 370

                    while (left < right && nums[left] == nums[left + 1]) { // 371
                        left++; // 372
                    }
                    while (left < right && nums[right] == nums[right - 1]) { // 373
                        right--; // 374
                    }

                    left++; // 375
                    right--; // 376
                } else if (nums[left] + nums[right] < target) { // 377
                    left++; // 378
                } else { // 379
                    right--; // 380
                }
            }
        }

        return result;
    }


    public List<List<Integer>> threeSum19(int[] nums) {
        List<List<Integer>> result = new ArrayList<>(); // 381
        if (nums == null || nums.length < 3) { // 382
            return result;
        }

        Arrays.sort(nums); // 383

        for (int i = 0; i < nums.length - 2; i++) { // 384
            if (i > 0 && nums[i] == nums[i - 1]) { // 385
                continue; // 386
            }
            int target = -nums[i]; // 387
            int left = i + 1; // 388
            int right = nums.length - 1; // 389

            while (left < right) { // 390
                int sum = nums[left] + nums[right]; // 391

                if (sum == target) { // 392
                    result.add(Arrays.asList(nums[i], nums[left], nums[right])); // 393
                    left++; // 394
                    right--; // 395

                    while (left < right && nums[left] == nums[left - 1]) { // 396
                        left++; // 397
                    }
                    while (left < right && nums[right] == nums[right + 1]) { // 398
                        right--; // 399
                    }
                } else if (sum < target) { // 400
                    left++; // 401
                } else { // 402
                    right--; // 403
                }
            }
        }

        return result;
    }

    public List<List<Integer>> threeSum20(int[] nums) {
        List<List<Integer>> result = new ArrayList<>(); // 404

        Arrays.sort(nums); // 405

        for (int i = 0; i < nums.length - 2; i++) { // 406
            if (i == 0 || (i > 0 && nums[i] != nums[i - 1])) { // 407
                int lo = i + 1, hi = nums.length - 1, sum = 0 - nums[i]; // 408
                while (lo < hi) { // 409
                    if (nums[lo] + nums[hi] == sum) { // 410
                        result.add(Arrays.asList(nums[i], nums[lo], nums[hi])); // 411
                        while (lo < hi && nums[lo] == nums[lo + 1]) lo++; // 412
                        while (lo < hi && nums[hi] == nums[hi - 1]) hi--; // 413
                        lo++; // 414
                        hi--; // 415
                    } else if (nums[lo] + nums[hi] < sum) { // 416
                        lo++; // 417
                    } else { // 418
                        hi--; // 419
                    }
                }
            }
        }
        return result;
    }

}

