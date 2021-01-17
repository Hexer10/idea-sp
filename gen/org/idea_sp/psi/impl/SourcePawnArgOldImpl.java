// This is a generated file. Not intended for manual editing.
package org.idea_sp.psi.impl;

import java.util.List;
import org.jetbrains.annotations.*;
import com.intellij.lang.ASTNode;
import com.intellij.psi.PsiElement;
import com.intellij.psi.PsiElementVisitor;
import com.intellij.psi.util.PsiTreeUtil;
import static org.idea_sp.psi.SourcePawnTypes.*;
import com.intellij.extapi.psi.ASTWrapperPsiElement;
import org.idea_sp.psi.*;

public class SourcePawnArgOldImpl extends ASTWrapperPsiElement implements SourcePawnArgOld {

  public SourcePawnArgOldImpl(@NotNull ASTNode node) {
    super(node);
  }

  public void accept(@NotNull SourcePawnVisitor visitor) {
    visitor.visitArgOld(this);
  }

  @Override
  public void accept(@NotNull PsiElementVisitor visitor) {
    if (visitor instanceof SourcePawnVisitor) accept((SourcePawnVisitor)visitor);
    else super.accept(visitor);
  }

  @Override
  @Nullable
  public SourcePawnArgInit getArgInit() {
    return findChildByClass(SourcePawnArgInit.class);
  }

  @Override
  @Nullable
  public SourcePawnOldDims getOldDims() {
    return findChildByClass(SourcePawnOldDims.class);
  }

  @Override
  @Nullable
  public SourcePawnTags getTags() {
    return findChildByClass(SourcePawnTags.class);
  }

  @Override
  @NotNull
  public PsiElement getSymbol() {
    return findNotNullChildByType(SYMBOL);
  }

}
