/**
 * All rights Reserved, Designed By Suixingpay.
 *
 * @author: ning_jq[ning_jq@suixingpay.com]
 * @date: 2020/5/24 下午8:14
 * @Copyright ©2020 Suixingpay. All rights reserved.
 * 注意：本内容仅限于随行付支付有限公司内部传阅，禁止外泄以及用于其他的商业用途。
 */
package designPatterns.strategy;

/**
 * 策略抽象
 *
 * @author: ning_jq[ning_jq@suixingpay.com]
 * @date: 2020/5/24 下午8:14
 * @version: V1.0
 * @review: ning_jq[ning_jq@suixingpay.com]/2020/5/24 下午8:14
 */
public class Strategy {

    public void backtrack(int n,
                        ArrayList<Integer> output,
                        List<List<Integer>> res,
                        int first) {
    // 所有数都填完了
    if (first == n)
      res.add(new ArrayList<Integer>(output));
    for (int i = first; i < n; i++) {
      // 动态维护数组
      Collections.swap(output, first, i);
      // 继续递归填下一个数
      backtrack(n, output, res, first + 1);
      // 撤销操作
      Collections.swap(output, first, i);
    }
  }

  public List<List<Integer>> permute(int[] nums) {
    List<List<Integer>> res = new LinkedList();

    ArrayList<Integer> output = new ArrayList<Integer>();
    for (int num : nums)
      output.add(num);

    int n = nums.length;
    backtrack(n, output, res, 0);
    return res;
  }


}