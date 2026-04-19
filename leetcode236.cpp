class Solution {
public:
    bool found;

    void traverse(TreeNode* root, TreeNode* target, stack<TreeNode*>& st)
    {
        if (!root) return;

        if (root == target)
        {
            found = true;
            st.push(root);
            return;
        }

        st.push(root);

        traverse(root->left, target, st);
        traverse(root->right, target, st);

        if (!found)
            st.pop();
    }

    TreeNode* lowestCommonAncestor(TreeNode* root, TreeNode* p, TreeNode* q) 
    {
        stack<TreeNode*> s1, s2;

        found = false;
        traverse(root, p, s1);

        found = false;
        traverse(root, q, s2);

        vector<TreeNode*> v1, v2;

        while (!s1.empty())
        {
            v1.push_back(s1.top());
            s1.pop();
        }

        while (!s2.empty())
        {
            v2.push_back(s2.top());
            s2.pop();
        }

        reverse(v1.begin(), v1.end());
        reverse(v2.begin(), v2.end());

        TreeNode* lca = NULL;

        for (int i = 0; i < v1.size(); i++)
        {
            for (int j = 0; j < v2.size(); j++)
            {
                if (i == j && v1[i] == v2[j])
                    lca = v1[i];
            }
        }

        return lca;
    }
};