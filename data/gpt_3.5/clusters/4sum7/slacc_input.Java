

    public List<List<Integer>> fourSum1(int[] nums, int target) {
        List<List<Integer>> quadruplets = new ArrayList<>(); // 1
        Arrays.sort(nums); // 2

        int n = nums.length; // 3

        for (int a = 0; a < n - 3; a++) { // 4
            if (a > 0 && nums[a] == nums[a-1]) { // 5
                continue; // 6
            }

            for (int b = a + 1; b < n - 2; b++) { // 7
                if (b > a + 1 && nums[b] == nums[b-1]) { // 8
                    continue; // 9
                }

                int left = b + 1; // 10
                int right = n - 1; // 11

                while (left < right) { // 12
                    int sum = nums[a] + nums[b] + nums[left] + nums[right]; // 13

                    if (sum < target) { // 14
                        left++; // 15
                    } else if (sum > target) { // 16
                        right--; // 17
                    } else { // 18
                        quadruplets.add(Arrays.asList(nums[a], nums[b], nums[left], nums[right])); // 19

                        while (left < right && nums[left] == nums[left+1]) { // 20
                            left++; // 21
                        }
                        while (left < right && nums[right] == nums[right-1]) { // 22
                            right--; // 23
                        }

                        left++; // 24
                        right--; // 25
                    }
                }
            }
        }

        return quadruplets;
    }



    public List<List<Integer>> fourSum2(int[] nums, int target) {
        List<List<Integer>> result = new ArrayList<>(); // 26
        if (nums == null || nums.length < 4) { // 27
            return result;
        }
        Arrays.sort(nums); // 28
        int n = nums.length; // 29
        for (int i = 0; i < n - 3; i++) { // 30
            if (i > 0 && nums[i] == nums[i - 1]) { // 31
                continue; // 32
            }
            for (int j = i + 1; j < n - 2; j++) { // 33
                if (j > i + 1 && nums[j] == nums[j - 1]) { // 34
                    continue; // 35
                }
                int left = j + 1; // 36
                int right = n - 1; // 37
                while (left < right) { // 38
                    int sum = nums[i] + nums[j] + nums[left] + nums[right]; // 39
                    if (sum == target) { // 40
                        result.add(Arrays.asList(nums[i], nums[j], nums[left], nums[right])); // 41
                        while (left < right && nums[left] == nums[left + 1]) { // 42
                            left++; // 43
                        }
                        while (left < right && nums[right] == nums[right - 1]) { // 44
                            right--; // 45
                        }
                        left++; // 46
                        right--; // 47
                    } else if (sum < target) { // 48
                        left++; // 49
                    } else { // 50
                        right--; // 51
                    }
                }
            }
        }
        return result;
    }


    public static List<List<Integer>> fourSum3(int[] nums, int target) {
        List<List<Integer>> result = new ArrayList<>(); // 52

        if (nums == null || nums.length < 4) { // 53
            return result;
        }

        Arrays.sort(nums); // 54

        for (int i = 0; i < nums.length - 3; i++) { // 55
            if (i > 0 && nums[i] == nums[i - 1]) { // 56
                continue; // 57
            }

            for (int j = i + 1; j < nums.length - 2; j++) { // 58
                if (j > i + 1 && nums[j] == nums[j - 1]) { // 59
                    continue; // 60
                }

                int left = j + 1; // 61
                int right = nums.length - 1; // 62

                while (left < right) { // 63
                    int sum = nums[i] + nums[j] + nums[left] + nums[right]; // 64
                    if (sum < target) { // 65
                        left++; // 66
                    } else if (sum > target) { // 67
                        right--; // 68
                    } else { // 69
                        result.add(Arrays.asList(nums[i], nums[j], nums[left], nums[right])); // 70

                        while (left < right && nums[left] == nums[left + 1]) { // 71
                            left++; // 72
                        }
                        while (left < right && nums[right] == nums[right - 1]) { // 73
                            right--; // 74
                        }

                        left++; // 75
                        right--; // 76
                    }
                }
            }
        }

        return result;
    }

    public static List<List<Integer>> fourSum4(int[] nums, int target) {
        Arrays.sort(nums); // 77
        List<List<Integer>> quadruplets = new ArrayList<>(); // 78
        int n = nums.length; // 79

        for (int i = 0; i < n - 3; i++) { // 80
            if (i > 0 && nums[i] == nums[i - 1]) { // 81
                continue; // 82
            }

            for (int j = i + 1; j < n - 2; j++) { // 83
                if (j > i + 1 && nums[j] == nums[j - 1]) { // 84
                    continue; // 85
                }

                int left = j + 1; // 86
                int right = n - 1; // 87

                while (left < right) { // 88
                    int sum = nums[i] + nums[j] + nums[left] + nums[right]; // 89

                    if (sum < target) { // 90
                        left++; // 91
                    } else if (sum > target) { // 92
                        right--; // 93
                    } else { // 94
                        quadruplets.add(Arrays.asList(nums[i], nums[j], nums[left], nums[right])); // 95

                        while (left < right && nums[left] == nums[left + 1]) { // 96
                            left++; // 97
                        }

                        while (left < right && nums[right] == nums[right - 1]) { // 98
                            right--; // 99
                        }

                        left++; // 100
                        right--; // 101
                    }
                }
            }
        }

        return quadruplets;
    }


    public List<List<Integer>> fourSum5(int[] nums, int target) {
        List<List<Integer>> result = new ArrayList<>(); // 102
        if (nums == null || nums.length < 4) { // 103
            return result;
        }

        Arrays.sort(nums); // 104

        int n = nums.length; // 105

        for (int i = 0; i < n - 3; i++) { // 106
            if (i > 0 && nums[i] == nums[i - 1]) { // 107
                continue; // 108
            }
            for (int j = i + 1; j < n - 2; j++) { // 109
                if (j > i + 1 && nums[j] == nums[j - 1]) { // 110
                    continue; // 111
                }
                int left = j + 1; // 112
                int right = n - 1; // 113
                while (left < right) { // 114
                    int sum = nums[i] + nums[j] + nums[left] + nums[right]; // 115
                    if (sum == target) { // 116
                        result.add(Arrays.asList(nums[i], nums[j], nums[left], nums[right])); // 117
                        while (left < right && nums[left] == nums[left + 1]) { // 118
                            left++; // 119
                        }
                        while (left < right && nums[right] == nums[right - 1]) { // 120
                            right--; // 121
                        }
                        left++; // 122
                        right--; // 123
                    } else if (sum < target) { // 124
                        left++; // 125
                    } else { // 126
                        right--; // 127
                    }
                }
            }
        }
        return result;
    }


    public List<List<Integer>> fourSum6(int[] nums, int target) {
        List<List<Integer>> result = new ArrayList<>(); // 128

        Arrays.sort(nums); // 129

        for (int i = 0; i < nums.length - 3; i++) { // 130
            if (i > 0 && nums[i] == nums[i - 1]) { // 131
                continue; // 132
            }

            for (int j = i + 1; j < nums.length - 2; j++) { // 133
                if (j > i + 1 && nums[j] == nums[j - 1]) { // 134
                    continue; // 135
                }

                int left = j + 1; // 136
                int right = nums.length - 1; // 137

                while (left < right) { // 138
                    int sum = nums[i] + nums[j] + nums[left] + nums[right]; // 139

                    if (sum < target) { // 140
                        left++; // 141
                    } else if (sum > target) { // 142
                        right--; // 143
                    } else { // 144
                        List<Integer> quadruplet = new ArrayList<>(); // 145
                        quadruplet.add(nums[i]); // 146
                        quadruplet.add(nums[j]); // 147
                        quadruplet.add(nums[left]); // 148
                        quadruplet.add(nums[right]); // 149
                        result.add(quadruplet); // 150

                        while (left < right && nums[left] == nums[left + 1]) { // 151
                            left++; // 152
                        }
                        while (left < right && nums[right] == nums[right - 1]) { // 153
                            right--; // 154
                        }

                        left++; // 155
                        right--; // 156
                    }
                }
            }
        }

        return result;
    }


    public List<List<Integer>> fourSum7(int[] nums, int target) {
        List<List<Integer>> result = new ArrayList<>(); // 157
        int n = nums.length; // 158
        if (n < 4) return result;
        Arrays.sort(nums); // 159
        for (int i = 0; i < n - 3; i++) { // 160
            if (i > 0 && nums[i] == nums[i - 1]) continue; // 161
            for (int j = i + 1; j < n - 2; j++) { // 162
                if (j > i + 1 && nums[j] == nums[j - 1]) continue; // 163
                int left = j + 1; // 164
                int right = n - 1; // 165
                while (left < right) { // 166
                    int sum = nums[i] + nums[j] + nums[left] + nums[right]; // 167
                    if (sum == target) { // 168
                        result.add(Arrays.asList(nums[i], nums[j], nums[left], nums[right])); // 169
                        while (left < right && nums[left] == nums[left + 1]) left++; // 170
                        while (left < right && nums[right] == nums[right - 1]) right--; // 171
                        left++; // 172
                        right--; // 173
                    } else if (sum < target) { // 174
                        left++; // 175
                    } else { // 176
                        right--; // 177
                    }
                }
            }
        }
        return result;
    }

    public static List<List<Integer>> fourSum8(int[] nums, int target) {
        List<List<Integer>> result = new ArrayList<>(); // 178

        if (nums == null || nums.length < 4) { // 179
            return result;
        }

        Arrays.sort(nums); // 180

        for (int i = 0; i < nums.length - 3; i++) { // 181
            if (i > 0 && nums[i] == nums[i-1]) { // 182
                continue; // 183
            }

            for (int j = i+1; j < nums.length - 2; j++) { // 184
                if (j > i+1 && nums[j] == nums[j-1]) { // 185
                    continue; // 186
                }

                int left = j+1; // 187
                int right = nums.length - 1; // 188

                while (left < right) { // 189
                    int sum = nums[i] + nums[j] + nums[left] + nums[right]; // 190

                    if (sum == target) { // 191
                        result.add(Arrays.asList(nums[i], nums[j], nums[left], nums[right])); // 192

                        while (left < right && nums[left] == nums[left+1]) { // 193
                            left++; // 194
                        }

                        while (left < right && nums[right] == nums[right-1]) { // 195
                            right--; // 196
                        }

                        left++; // 197
                        right--; // 198
                    } else if (sum < target) { // 199
                        left++; // 200
                    } else { // 201
                        right--; // 202
                    }
                }
            }
        }

        return result;
    }


    public List<List<Integer>> fourSum9(int[] nums, int target) {
        List<List<Integer>> result = new ArrayList<>(); // 203
        Arrays.sort(nums); // 204
        int n = nums.length; // 205

        for (int i = 0; i < n - 3; i++) { // 206
            if (i > 0 && nums[i] == nums[i - 1]) { // 207
                continue; // 208
            }
            for (int j = i + 1; j < n - 2; j++) { // 209
                if (j > i + 1 && nums[j] == nums[j - 1]) { // 210
                    continue; // 211
                }
                int left = j + 1; // 212
                int right = n - 1; // 213
                while (left < right) { // 214
                    int sum = nums[i] + nums[j] + nums[left] + nums[right]; // 215
                    if (sum < target) { // 216
                        left++; // 217
                    } else if (sum > target) { // 218
                        right--; // 219
                    } else { // 220
                        result.add(Arrays.asList(nums[i], nums[j], nums[left], nums[right])); // 221
                        while (left < right && nums[left] == nums[left + 1]) { // 222
                            left++; // 223
                        }
                        while (left < right && nums[right] == nums[right - 1]) { // 224
                            right--; // 225
                        }
                        left++; // 226
                        right--; // 227
                    }
                }
            }
        }

        return result;
    }

    public static List<List<Integer>> fourSum10(int[] nums, int target) {
        List<List<Integer>> result = new ArrayList<>(); // 228

        if(nums == null || nums.length < 4){ // 229
            return result;
        }

        Arrays.sort(nums); // 230

        for(int i = 0; i < nums.length - 3; i++){ // 231
            if(i > 0 && nums[i] == nums[i-1]){ // 232
                continue; // 233
            }

            for(int j = i+1; j < nums.length - 2; j++){ // 234
                if(j > i+1 && nums[j] == nums[j-1]){ // 235
                    continue; // 236
                }

                int left = j+1; // 237
                int right = nums.length - 1; // 238

                while(left < right){ // 239
                    int sum = nums[i] + nums[j] + nums[left] + nums[right]; // 240

                    if(sum == target){ // 241
                        result.add(Arrays.asList(nums[i], nums[j], nums[left], nums[right])); // 242

                        while(left < right && nums[left] == nums[left+1]){ // 243
                            left++; // 244
                        }

                        while(left < right && nums[right] == nums[right-1]){ // 245
                            right--; // 246
                        }

                        left++; // 247
                        right--; // 248
                    }else if(sum < target){ // 249
                        left++; // 250
                    }else{ // 251
                        right--; // 252
                    }
                }
            }
        }

        return result;
    }


    public List<List<Integer>> fourSum11(int[] nums, int target) {
        List<List<Integer>> result = new ArrayList<>(); // 253
        Arrays.sort(nums); // 254

        for (int i = 0; i < nums.length - 3; i++) { // 255
            if (i > 0 && nums[i] == nums[i - 1]) { // 256
                continue; // 257
            }

            for (int j = i + 1; j < nums.length - 2; j++) { // 258
                if (j > i + 1 && nums[j] == nums[j - 1]) { // 259
                    continue; // 260
                }

                int left = j + 1; // 261
                int right = nums.length - 1; // 262

                while (left < right) { // 263
                    int sum = nums[i] + nums[j] + nums[left] + nums[right]; // 264

                    if (sum < target) { // 265
                        left++; // 266
                    } else if (sum > target) { // 267
                        right--; // 268
                    } else { // 269
                        result.add(Arrays.asList(nums[i], nums[j], nums[left], nums[right])); // 270
                        left++; // 271
                        right--; // 272

                        while (left < right && nums[left] == nums[left - 1]) { // 273
                            left++; // 274
                        }

                        while (left < right && nums[right] == nums[right + 1]) { // 275
                            right--; // 276
                        }
                    }
                }
            }
        }

        return result;
    }



    public static List<List<Integer>> fourSum12(int[] nums, int target) {
        List<List<Integer>> result = new ArrayList<>(); // 277
        if (nums == null || nums.length < 4) { // 278
            return result;
        }
        Arrays.sort(nums); // 279

        for (int i = 0; i < nums.length - 3; i++) { // 280
            if (i > 0 && nums[i] == nums[i - 1]) { // 281
                continue; // 282
            }
            for (int j = i + 1; j < nums.length - 2; j++) { // 283
                if (j > i + 1 && nums[j] == nums[j - 1]) { // 284
                    continue; // 285
                }
                int left = j + 1; // 286
                int right = nums.length - 1; // 287
                while (left < right) { // 288
                    int sum = nums[i] + nums[j] + nums[left] + nums[right]; // 289
                    if (sum == target) { // 290
                        result.add(Arrays.asList(nums[i], nums[j], nums[left], nums[right])); // 291
                        while (left < right && nums[left] == nums[left + 1]) { // 292
                            left++; // 293
                        }
                        while (left < right && nums[right] == nums[right - 1]) { // 294
                            right--; // 295
                        }
                        left++; // 296
                        right--; // 297
                    } else if (sum < target) { // 298
                        left++; // 299
                    } else { // 300
                        right--; // 301
                    }
                }
            }
        }
        return result;
    }


    public static List<List<Integer>> uniqueQuadruplets13(int[] nums, int target) {
        List<List<Integer>> result = new ArrayList<>(); // 302
        if (nums == null || nums.length < 4) // 303
            return result;

        Arrays.sort(nums); // 304
        int n = nums.length; // 305

        for (int i = 0; i < n - 3; i++) { // 306
            if (i > 0 && nums[i] == nums[i - 1]) // 307
                continue; // 308

            for (int j = i + 1; j < n - 2; j++) { // 309
                if (j > i + 1 && nums[j] == nums[j - 1]) // 310
                    continue; // 311

                int left = j + 1; // 312
                int right = n - 1; // 313

                while (left < right) { // 314
                    int sum = nums[i] + nums[j] + nums[left] + nums[right]; // 315
                    if (sum == target) { // 316
                        List<Integer> quadruplet = new ArrayList<>(); // 317
                        quadruplet.add(nums[i]); // 318
                        quadruplet.add(nums[j]); // 319
                        quadruplet.add(nums[left]); // 320
                        quadruplet.add(nums[right]); // 321
                        result.add(quadruplet); // 322

                        while (left < right && nums[left] == nums[left + 1]) // 323
                            left++; // 324
                        while (left < right && nums[right] == nums[right - 1]) // 325
                            right--; // 326

                        left++; // 327
                        right--; // 328
                    } else if (sum < target) { // 329
                        left++; // 330
                    } else { // 331
                        right--; // 332
                    }
                }
            }
        }

        return result;
    }


    public List<List<Integer>> fourSum14(int[] nums, int target) {
        List<List<Integer>> result = new ArrayList<>(); // 333
        if (nums == null || nums.length < 4) { // 334
            return result;
        }
        Arrays.sort(nums); // 335
        int n = nums.length; // 336
        for (int i = 0; i < n - 3; i++) { // 337
            if (i > 0 && nums[i] == nums[i - 1]) { // 338
                continue; // 339
            }
            for (int j = i + 1; j < n - 2; j++) { // 340
                if (j > i + 1 && nums[j] == nums[j - 1]) { // 341
                    continue; // 342
                }
                int left = j + 1; // 343
                int right = n - 1; // 344
                while (left < right) { // 345
                    int sum = nums[i] + nums[j] + nums[left] + nums[right]; // 346
                    if (sum == target) { // 347
                        result.add(Arrays.asList(nums[i], nums[j], nums[left], nums[right])); // 348
                        while (left < right && nums[left] == nums[left + 1]) { // 349
                            left++; // 350
                        }
                        while (left < right && nums[right] == nums[right - 1]) { // 351
                            right--; // 352
                        }
                        left++; // 353
                        right--; // 354
                    } else if (sum < target) { // 355
                        left++; // 356
                    } else { // 357
                        right--; // 358
                    }
                }
            }
        }
        return result;
    }

   public static List<List<Integer>> fourSum15(int[] nums, int target) {
       List<List<Integer>> result = new ArrayList<>(); // 359

       if (nums == null || nums.length < 4) { // 360
           return result;
       }

       Arrays.sort(nums); // 361

       for (int i = 0; i < nums.length - 3; i++) { // 362
           if (i > 0 && nums[i] == nums[i - 1]) { // 363
               continue; // 364
           }

           for (int j = i + 1; j < nums.length - 2; j++) { // 365
               if (j > i + 1 && nums[j] == nums[j - 1]) { // 366
                   continue; // 367
               }

               int left = j + 1; // 368
               int right = nums.length - 1; // 369

               while (left < right) { // 370
                   int sum = nums[i] + nums[j] + nums[left] + nums[right]; // 371

                   if (sum < target) { // 372
                       left++; // 373
                   } else if (sum > target) { // 374
                       right--; // 375
                   } else { // 376
                       result.add(Arrays.asList(nums[i], nums[j], nums[left], nums[right])); // 377

                       while (left < right && nums[left] == nums[left + 1]) { // 378
                           left++; // 379
                       }
                       while (left < right && nums[right] == nums[right - 1]) { // 380
                           right--; // 381
                       }

                       left++; // 382
                       right--; // 383
                   }
               }
           }
       }

       return result;
   }


    public static List<List<Integer>> uniqueQuadruplets16(int[] nums, int target) {
        List<List<Integer>> result = new ArrayList<>(); // 384
        Arrays.sort(nums); // 385
        int n = nums.length; // 386
        for (int i = 0; i < n - 3; i++) { // 387
            if (i > 0 && nums[i] == nums[i - 1]) // 388
                continue; // 389
            for (int j = i + 1; j < n - 2; j++) { // 390
                if (j > i + 1 && nums[j] == nums[j - 1]) // 391
                    continue; // 392
                int left = j + 1; // 393
                int right = n - 1; // 394
                while (left < right) { // 395
                    int sum = nums[i] + nums[j] + nums[left] + nums[right]; // 396
                    if (sum == target) { // 397
                        result.add(Arrays.asList(nums[i], nums[j], nums[left], nums[right])); // 398
                        while (left < right && nums[left] == nums[left + 1]) // 399
                            left++; // 400
                        while (left < right && nums[right] == nums[right - 1]) // 401
                            right--; // 402
                        left++; // 403
                        right--; // 404
                    } else if (sum < target) { // 405
                        left++; // 406
                    } else { // 407
                        right--; // 408
                    }
                }
            }
        }
        return result;
    }


    public List<List<Integer>> fourSum17(int[] nums, int target) {
        List<List<Integer>> result = new ArrayList<>(); // 409
        if (nums == null || nums.length < 4) { // 410
            return result;
        }

        Arrays.sort(nums); // 411
        int n = nums.length; // 412

        for (int i = 0; i < n - 3; i++) { // 413
            if (i > 0 && nums[i] == nums[i - 1]) { // 414
                continue; // 415
            }

            for (int j = i + 1; j < n - 2; j++) { // 416
                if (j > i + 1 && nums[j] == nums[j - 1]) { // 417
                    continue; // 418
                }

                int left = j + 1; // 419
                int right = n - 1; // 420

                while (left < right) { // 421
                    int sum = nums[i] + nums[j] + nums[left] + nums[right]; // 422

                    if (sum < target) { // 423
                        left++; // 424
                    } else if (sum > target) { // 425
                        right--; // 426
                    } else { // 427
                        result.add(Arrays.asList(nums[i], nums[j], nums[left], nums[right])); // 428

                        while (left < right && nums[left] == nums[left + 1]) { // 429
                            left++; // 430
                        }

                        while (left < right && nums[right] == nums[right - 1]) { // 431
                            right--; // 432
                        }

                        left++; // 433
                        right--; // 434
                    }
                }
            }
        }

        return result;
    }


    public static List<List<Integer>> fourSum18(int[] nums, int target) {
        List<List<Integer>> quadruplets = new ArrayList<>(); // 435
        int n = nums.length; // 436
        Arrays.sort(nums); // 437

        for (int i = 0; i < n - 3; i++) { // 438
            if (i > 0 && nums[i] == nums[i - 1]) continue; // 439
            for (int j = i + 1; j < n - 2; j++) { // 440
                if (j > i + 1 && nums[j] == nums[j - 1]) continue; // 441
                int left = j + 1; // 442
                int right = n - 1; // 443
                while (left < right) { // 444
                    int sum = nums[i] + nums[j] + nums[left] + nums[right]; // 445
                    if (sum == target) { // 446
                        quadruplets.add(Arrays.asList(nums[i], nums[j], nums[left], nums[right])); // 447
                        while (left < right && nums[left] == nums[left + 1]) left++; // 448
                        while (left < right && nums[right] == nums[right - 1]) right--; // 449
                        left++; // 450
                        right--; // 451
                    } else if (sum < target) { // 452
                        left++; // 453
                    } else { // 454
                        right--; // 455
                    }
                }
            }
        }

        return quadruplets;
    }


    public List<List<Integer>> fourSum19(int[] nums, int target) {
        List<List<Integer>> result = new ArrayList<>(); // 456
        if (nums == null || nums.length < 4) // 457
            return result;

        Arrays.sort(nums); // 458
        int n = nums.length; // 459
        for (int i = 0; i < n - 3; i++) { // 460
            if (i > 0 && nums[i] == nums[i - 1]) // 461
                continue; // 462
            for (int j = i + 1; j < n - 2; j++) { // 463
                if (j > i + 1 && nums[j] == nums[j - 1]) // 464
                    continue; // 465

                int left = j + 1; // 466
                int right = n - 1; // 467
                while (left < right) { // 468
                    int sum = nums[i] + nums[j] + nums[left] + nums[right]; // 469
                    if (sum == target) { // 470
                        List<Integer> quadruplet = new ArrayList<>(); // 471
                        quadruplet.add(nums[i]); // 472
                        quadruplet.add(nums[j]); // 473
                        quadruplet.add(nums[left]); // 474
                        quadruplet.add(nums[right]); // 475
                        result.add(quadruplet); // 476

                        while (left < right && nums[left] == nums[left + 1]) // 477
                            left++; // 478
                        while (left < right && nums[right] == nums[right - 1]) // 479
                            right--; // 480

                        left++; // 481
                        right--; // 482
                    } else if (sum < target) { // 483
                        left++; // 484
                    } else { // 485
                        right--; // 486
                    }
                }
            }
        }
        return result;
    }


    public List<List<Integer>> fourSum20(int[] nums, int target) {
        List<List<Integer>> result = new ArrayList<>(); // 487
        if (nums == null || nums.length < 4) { // 488
            return result;
        }
        Arrays.sort(nums); // 489
        int n = nums.length; // 490
        for (int i = 0; i < n - 3; i++) { // 491
            if (i > 0 && nums[i] == nums[i - 1]) { // 492
                continue; // 493
            }
            for (int j = i + 1; j < n - 2; j++) { // 494
                if (j > i + 1 && nums[j] == nums[j - 1]) { // 495
                    continue; // 496
                }
                int left = j + 1; // 497
                int right = n - 1; // 498
                while (left < right) { // 499
                    int sum = nums[i] + nums[j] + nums[left] + nums[right]; // 500
                    if (sum == target) { // 501
                        result.add(Arrays.asList(nums[i], nums[j], nums[left], nums[right])); // 502
                        while (left < right && nums[left] == nums[left + 1]) { // 503
                            left++; // 504
                        }
                        while (left < right && nums[right] == nums[right - 1]) { // 505
                            right--; // 506
                        }
                        left++; // 507
                        right--; // 508
                    } else if (sum < target) { // 509
                        left++; // 510
                    } else { // 511
                        right--; // 512
                    }
                }
            }
        }
        return result;
    }




