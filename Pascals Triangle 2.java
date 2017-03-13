class Solution(object):
    def getRow(self, rowIndex):
        """
        :type rowIndex: int
        :rtype: List[int]
        """
        res = [1]
        tmp = 1
        for k in range(rowIndex):
            tmp = (tmp*(rowIndex-k))/(k+1)
            res.append(tmp)
        return res
