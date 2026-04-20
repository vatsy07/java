class Solution {
public:
    int pairSum(ListNode* head) {
        
        
        vector<int> arr;
        ListNode* temp = head;
        
        while(temp != NULL) {
            arr.push_back(temp->val);
            temp = temp->next;
        }

        
        int n = arr.size();
        int sum = 0;

        for(int i = 0; i < n/2; i++) {
            int t = arr[i] + arr[n - i - 1];
            if(t >= sum) {
                sum = t;
            }
        }

        return sum;
    }
};