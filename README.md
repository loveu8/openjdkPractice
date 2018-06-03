OpenJDK 10 Practice Project
================
UNIT 1 Test Local-Variable Type Inference (var)
------------------------------------------------
We can see the test result.<br>
Avg Cost Time (ms) : When you use more var. According to different object forms. It may the average execution time per second increase. However, some are reduced. <br>
Avg Use Memory (MB) : Basically the test results will not differ too much. Unless you have a large number of executions, you can reduce the use var. <br>
<table>
    <tr><td>type</td><td>avgCostTime(ms)</td><td>avgUseMemory(MB)</td><td>runtime</td><td>looptime</td></tr>
    <tr><td>OldArrayList</td><td>3</td><td>3</td><td>100000</td><td>100</td></tr>
	<tr><td>NewArrayList</td><td>1</td><td>2</td><td>100000</td><td>100</td></tr>
	<tr><td>OldLinkedList</td><td>14</td><td>4</td><td>100000</td><td>100</td></tr>
	<tr><td>NewLinkedList</td><td>12</td><td>4</td><td>100000</td><td>100</td></tr>
	<tr><td>OldHashMap</td><td>14</td><td>10</td><td>100000</td><td>100</td></tr>
	<tr><td>NewHashMap</td><td>20</td><td>10</td><td>100000</td><td>100</td></tr>
	<tr><td>OldLinkedHashMap</td><td>13</td><td>10</td><td>100000</td><td>100</td></tr>
	<tr><td>NewLinkedHashMap</td><td>26</td><td>10</td><td>100000</td><td>100</td></tr>
	<tr><td>OldHashSet</td><td>9</td><td>8</td><td>100000</td><td>100</td></tr>
	<tr><td>NewHashSet</td><td>18</td><td>8</td><td>100000</td><td>100</td></tr>
	<tr><td>OldLinkedHashSet</td><td>17</td><td>9</td><td>100000</td><td>100</td></tr>
	<tr><td>NewLinkedHashSet</td><td>24</td><td>9</td><td>100000</td><td>100</td></tr>
	<tr><td>OldIntAdd</td><td>0</td><td>0</td><td>100000</td><td>100</td></tr>
	<tr><td>NewIntAdd</td><td>0</td><td>0</td><td>100000</td><td>100</td></tr>
	<tr><td>OldBigDecimalAdd</td><td>0</td><td>3</td><td>100000</td><td>100</td></tr>
	<tr><td>NewBigDecimalAdd</td><td>0</td><td>3</td><td>100000</td><td>100</td></tr>
	<tr><td>OldString</td><td>96</td><td>28</td><td>10000</td><td>100</td></tr>
	<tr><td>NewString</td><td>91</td><td>29</td><td>10000</td><td>100</td></tr>
	<tr><td>OldStringBuilder</td><td>2</td><td>2</td><td>100000</td><td>100</td></tr>
	<tr><td>NewStringBuilder</td><td>1</td><td>2</td><td>100000</td><td>100</td></tr>
	<tr><td>OldThread</td><td>700</td><td>6</td><td>10000</td><td>100</td></tr>
	<tr><td>NewThread</td><td>695</td><td>6</td><td>10000</td><td>100</td></tr>
	<tr><td>OldHttps</td><td>1173</td><td>5</td><td>10</td><td>100</td></tr>
	<tr><td>NewHttps</td><td>1001</td><td>5</td><td>10</td><td>100</td></tr>
</table>
