import pandas as pd
import numpy as np
import matplotlib.pyplot as plt

print("Cell 1: imports OK")

# Cell 2
df_raw = pd.read_csv('data/sales.csv')
print("Cell 2: df_raw.head():")
print(df_raw.head().to_string())

# Cell 3
df = df_raw.copy()
df["discount"] = df["discount"].fillna(0)
print("Cell 3: df.head():")
print(df.head().to_string())
