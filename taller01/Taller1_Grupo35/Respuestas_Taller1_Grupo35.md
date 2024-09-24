# 1 visitIntegerConstant

| n                         | OUT[n](x)   |     |
| ------------------------- | ----------- | --- |
| x=0                       | zero Z      |     |
| x=K// con K distinto de 0 | non_zero NZ |     |
|                           |             |     |
# 2 visitLocal
| IN[n](y) | OUT[n](x)     |
| -------- | ------------- |
| ⊥        | bottom ⊥      |
| Z        | zero Z        |
| NZ       | non_zero NZ   |
| MZ       | maybe_zero MZ |
# 3 add
| IN[n](y) | IN[n](x) | OUT[n](x)     |
| -------- | -------- | ------------- |
| ⊥        | ⊥        | bottom ⊥      |
| Z        | ⊥        | bottom ⊥      |
| NZ       | ⊥        | bottom ⊥      |
| MZ       | ⊥        | bottom ⊥      |
| ⊥        | Z        | bottom ⊥      |
| Z        | Z        | zero Z        |
| NZ       | Z        | non_zero NZ   |
| MZ       | Z        | maybe_zero MZ |
| ⊥        | NZ       | bottom ⊥      |
| Z        | NZ       | non_zero NZ   |
| NZ       | NZ       | maybe_zero MZ |
| MZ       | NZ       | maybe_zero MZ |
| ⊥        | MZ       | bottom ⊥      |
| Z        | MZ       | maybe_zero MZ |
| NZ       | MZ       | maybe_zero MZ |
| MZ       | MZ       | maybe_zero MZ |

# 4 subtract
| IN[n](y) | IN[n](x) | OUT[n](x)     | 
| -------- | -------- | ------------- | 
| ⊥        | ⊥        | bottom ⊥      | 
| Z        | ⊥        | bottom ⊥      | 
| NZ       | ⊥        | bottom ⊥      | 
| MZ       | ⊥        | bottom ⊥      | 
| ⊥        | Z        | bottom ⊥      | 
| Z        | Z        | zero Z        | 
| NZ       | Z        | non_zero NZ   | 
| MZ       | Z        | maybe_zero MZ | 
| ⊥        | NZ       | bottom ⊥      | 
| Z        | NZ       | non_zero NZ   | 
| NZ       | NZ       | maybe_zero MZ | 
| MZ       | NZ       | maybe_zero MZ | 
| ⊥        | MZ       | bottom ⊥      | 
| Z        | MZ       | maybe_zero MZ | 
| NZ       | MZ       | maybe_zero MZ | 
| MZ       | MZ       | maybe_zero MZ |   

# 5 multiplyBy
| IN[n](y) | IN[n](x) | OUT[n](x)     |
| -------- | -------- | ------------- |
| ⊥        | ⊥        | bottom ⊥      |
| Z        | ⊥        | bottom ⊥      |
| NZ       | ⊥        | bottom ⊥      |
| MZ       | ⊥        | bottom ⊥      |
| ⊥        | Z        | bottom ⊥      |
| Z        | Z        | zero Z        |
| NZ       | Z        | zero Z        |
| MZ       | Z        | zero Z        |
| ⊥        | NZ       | bottom ⊥      |
| Z        | NZ       | zero Z        |
| NZ       | NZ       | non_zero Z    |
| MZ       | NZ       | maybe_zero MZ |
| ⊥        | MZ       | bottom ⊥      |
| Z        | MZ       | zero Z        |
| NZ       | MZ       | maybe_zero MZ |
| MZ       | MZ       | maybe_zero MZ |
# 6 divideBy
| IN[n](y) | IN[n](x) | OUT[n](x)     |
| -------- | -------- | ------------- |
| ⊥        | ⊥        | bottom ⊥      |
| Z        | ⊥        | bottom ⊥      |
| NZ       | ⊥        | bottom ⊥      |
| MZ       | ⊥        | bottom ⊥      |
| ⊥        | Z        | bottom ⊥      |
| Z        | Z        | bottom ⊥      |
| NZ       | Z        | bottom ⊥      |
| MZ       | Z        | bottom ⊥      |
| ⊥        | NZ       | bottom ⊥      |
| Z        | NZ       | zero Z        |
| NZ       | NZ       | maybe_zero MZ |
| MZ       | NZ       | maybe_zero MZ |
| ⊥        | MZ       | bottom ⊥      |
| Z        | MZ       | zero Z        |
| NZ       | MZ       | maybe_zero MZ |
| MZ       | MZ       | maybe_zero MZ |
# 7 Control-flow graph
| n   | IN[n](x)      | IN[n](y)      | OUT[n](x)     | OUT[n](y)     |
| --- | ------------- | ------------- | ------------- | ------------- |
| 1   | bottom ⊥      | maybe_zero MZ | bottom ⊥      | maybe_zero MZ |
| 2   | bottom ⊥      | maybe_zero MZ | maybe_zero MZ | maybe_zero MZ |
| 3   | maybe_zero MZ | maybe_zero MZ | maybe_zero MZ | non_zero NZ   |
| 4   | maybe_zero MZ | maybe_zero MZ | maybe_zero MZ | maybe_zero MZ |
| 5   | maybe_zero MZ | maybe_zero MZ | maybe_zero MZ | maybe_zero MZ |
| 6   | maybe_zero MZ | maybe_zero MZ | maybe_zero MZ | maybe_zero MZ |
| 7   | maybe_zero MZ | maybe_zero MZ | maybe_zero MZ | maybe_zero MZ |
